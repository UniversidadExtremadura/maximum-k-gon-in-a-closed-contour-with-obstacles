import numpy as np
from time import time
from fractions import Fraction

# fun, 0 = AREA, 1 = PERIMETER

Points = [[5,9],[6,8],[7,8],[8,6],[7,4],
[8,2],[7,1],[6,1],[4,0],[3,1],
[2,1],[2,2],[2,3],[1,4],[1,5],
[2,6],[3,8],[4,8],[5,8],[3,7],
[4,7],[5,7],[6,7],[7,7],[3,6],
[4,6],[5,6],[7,6],[2,5],[3,5],
[4,5],[5,5],[6,5],[7,5],[2,4],
[3,4],[4,4],[5,4],[6,4],[3,3],
[4,3],[7,3],[3,2],[4,2],[5,2],
[6,2],[7,2],[4,1],[5,1]];

Polygon = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18];
PointsP = [33,43,48];
SegmentsP = [[20,25,30,36],[21,25,29]];
HolesP = [[23,28,34,27],[38,42,45,41]];

def Direction(p, q, r):
    dire = (q[0] - p[0]) * (r[1] - p[1]) - (r[0] - p[0]) * (q[1] - p[1])
    round(dire, 1)
    return dire

def Alignedp(p, q, r):
    alinp = min(p[0], q[0]) <= r[0] <= max(p[0], q[0]) and min(p[1], q[1]) <= r[1] <= max(p[1], q[1])
    return alinp

def Intersection(l1, l2):
    inter = False
    p1 = l1[0]
    p2 = l1[1]
    p3 = l2[0]
    p4 = l2[1]
    d1 = Direction(p3, p4, p1)
    d2 = Direction(p3, p4, p2)
    d3 = Direction(p1, p2, p3)
    d4 = Direction(p1, p2, p4)
    if p1 != p3 and p1 != p4 and p2 != p3 and p2 != p4:
        if ((d1 > 0 and d2 < 0) or (d1 < 0 and d2 > 0)) and ((d3 > 0 and d4 < 0) or (d3 < 0 and d4 > 0)):
            inter = True
        else:
            if d1 == 0 and Alignedp(p3, p4, p1):
                inter = True
            else:
                if d2 == 0 and Alignedp(p3, p4, p2):
                    inter = True
                else:
                    if d3 == 0 and Alignedp(p1, p2, p3):
                        inter = True
                    else:
                        if d4 == 0 and Alignedp(p1, p2, p4):
                            inter = True
    else:
        inter = False
    return inter

def AlignedPol(p, poly):
    alin = False
    lad = []
    for i in range(0, len(poly)):
        lad.append(poly[i])
    lad.append(poly[0])
    for i in range(0, len(lad) - 1):
        if Direction(Points[lad[i] - 1], Points[lad[i + 1] - 1], p) == 0:
            if Alignedp(Points[lad[i] - 1], Points[lad[i + 1] - 1], p):
                alin = True
                break
    return alin

def Angle(u, v):
    if not isinstance(u[0], int) and not isinstance(u[0], float):
        num = u[0].numerator
        dem = u[0].denominator
        u[0] = num / dem
    if not isinstance(u[1], int) and not isinstance(u[1], float):
        num = u[1].numerator
        dem = u[1].denominator
        u[1] = num / dem
    if not isinstance(v[0], int) and not isinstance(v[0], float):
        num = v[0].numerator
        dem = v[0].denominator
        v[0] = num / dem
    if not isinstance(v[1], int) and not isinstance(v[1], float):
        num = v[1].numerator
        dem = v[1].denominator
        v[1] = num / dem
    angle = 0
    if u[0] * u[0] + u[1] * u[1] != 0:
        if v[0] * v[0] + v[1] * v[1] != 0:
            det = u[0] * v[1] - u[1] * v[0]
            v1_u = u / np.linalg.norm(u)
            v2_u = v / np.linalg.norm(v)
            if det > 0:
                angle = np.arccos(np.clip(np.dot(v1_u, v2_u), -1.0, 1.0))
            else:
                angle = -np.arccos(np.clip(np.dot(v1_u, v2_u), -1.0, 1.0))
    return angle

def PointIn(p, poly):
    if AlignedPol(p, poly):
        point = True
    else:
        point = False
        n = len(poly)
        sum = 0
        for i in range(0, n - 1):
            sum = sum + Angle([Points[poly[i] - 1][0] - p[0], Points[poly[i] - 1][1] - p[1]],
                                 [Points[poly[i + 1] - 1][0] - p[0], Points[poly[i + 1] - 1][1] - p[1]])
        sum = sum + Angle([Points[poly[n - 1] - 1][0] - p[0], Points[poly[n - 1] - 1][1] - p[1]],
                             [Points[poly[0] - 1][0] - p[0], Points[poly[0] - 1][1] - p[1]])

        if np.abs(sum) >= np.pi:
            point = True
    return point

def SidesPol(poly):
    n = len(poly)
    lad = []
    for i in range(0, n - 1):
        lad.append([Points[poly[i] - 1], Points[poly[i + 1] - 1]])
    lad.append([Points[poly[n - 1] - 1], Points[poly[0] - 1]])
    return lad

def Medio(p, q):
    c1 = (p[0] + q[0]) / 2
    c2 = (p[1] + q[1]) / 2
    m = [c1, c2]
    return m

def Intersectionp(l1, l2):
    u1 = [l1[1][0] - l1[0][0], l1[1][1] - l1[0][1]]
    u2 = [l2[1][0] - l2[0][0], l2[1][1] - l2[0][1]]
    coinc = False
    if u1[0] * u2[1] == u1[1] * u2[0]:
        coinc = True
    if not coinc:
        if Intersection(l1, l2):
            a = l1[1][1] - l1[0][1]
            b = l1[0][0] - l1[1][0]
            c = l1[0][0] * l1[1][1] - l1[1][0] * l1[0][1]

            d = l2[1][1] - l2[0][1]
            e = l2[0][0] - l2[1][0]
            f = l2[0][0] * l2[1][1] - l2[1][0] * l2[0][1]
            if l1[0][0] == l1[1][0]:
                p = [c / a, (a * f - c * d) / (a * e)]
            else:
                if l1[0][1] == l1[1][1]:
                    p = [Fraction((b * f - c * e), (b * d)), Fraction(c, b)]
                else:
                    p = [Fraction((b * f - c * e), (b * d - a * e)), Fraction((a * f - c * d), (a * e - b * d))]
    else:
        p = l2[0]
    return p

def IntersectionPoly(l, side, poly, num):
    int2 = False
    eps = Fraction(1, 100000)
    if Intersection(l, side):
        p = Intersectionp(l, side)
        if l[0][0] == l[1][0]:
            m1 = [l[0][0], p[1] - eps]
            m2 = [l[0][0], p[1] + eps]
        else:
            if l[0][1] == l[1][1]:
                m1 = [p[0] - eps, l[0][1]]
                m2 = [p[0] + eps, l[0][1]]
            else:
                a = l[1][1] - l[0][1]
                b = l[0][0] - l[1][0]
                c = l[0][0] * l[1][1] - l[1][0] * l[0][1]

                m1 = [p[0] - eps, ((c - a * (p[0] - eps)) / b)]
                m2 = [p[0] + eps, ((c - a * (p[0] + eps)) / b)]

        if num == 0:
            if PointIn(m1, poly) == False or PointIn(m2, poly) == False:
                int2 = True
        if num == 1:
            if ((PointIn(m1, poly) == True and AlignedPol(m1, poly) == False) or (
                    PointIn(m2, poly) == True and AlignedPol(m2, poly) == False)):
                int2 = True
    return int2

def IntersectionPol(l):
    sides = SidesPol(Polygon)
    int2 = False
    for i in range(0, len(sides)):
        int2 = IntersectionPoly(l, sides[i], Polygon, 0)
        if int2:
            break

    if not int2:
        if SegmentsP:
            for i in range(0, len(SegmentsP)):
                if int2:
                    break
                n = len(SegmentsP[i])
                s = [Points[SegmentsP[i][0] - 1], Points[SegmentsP[i][n - 1] - 1]]
                if Intersection(l, s):
                    p = Intersectionp(l, s)
                    if (Direction(Points[SegmentsP[i][0] - 1], l[0], p) != 0 and Direction(Points[SegmentsP[i][0] - 1], l[1], p) != 0 and
                            Direction(Points[SegmentsP[i][n - 1] - 1], l[0], p) != 0 and Direction(Points[SegmentsP[i][n - 1] - 1], l[1], p) != 0):
                        int2 = True
        if HolesP:
            for i in range(0, len(HolesP)):
                hol = SidesPol(HolesP[i])
                if int2:
                    break
                for j in range(0, len(HolesP[i])):
                    int2 = IntersectionPoly(l, hol[j], HolesP[i], 1)
                    if int2:
                        break
    return int2

def Matrix(Points):
    matrix = []
    for i in range(0, len(Points)):
        matrix.append([])
        for j in range(0, len(Points)):
            matrix[i].append(0)

    sides = SidesPol(Polygon)
    for i in range(0, len(Points) - 1):
        for j in range(i + 1, len(Points)):
            l = [Points[i], Points[j]]
            aux2 = sides + [val for val in [l] if val not in sides]
            if len(aux2) == len(sides):
                matrix[i][j] = 1
            else:
                if not IntersectionPol(l):
                    m = Medio(Points[i], Points[j])
                    if PointIn(m, Polygon):
                        matrix[i][j] = 1
    if HolesP:
        for i in range(0, len(HolesP)):
            for j in range(0, len(HolesP[i]) - 1):
                for k in range(0, len(HolesP[i])):
                    m = Medio(Points[HolesP[i][j] - 1], Points[HolesP[i][k] - 1])
                    if not AlignedPol(m, HolesP[i]):
                        matrix[HolesP[i][j] - 1][HolesP[i][k] - 1] = 0
    for i in range(0, len(Points)):
        for j in range(0, len(Points)):
            matrix[j][i] = matrix[i][j]
    return matrix

def Aligned(poly):
    cam = poly.copy()
    cam.append(poly[0])
    cam.append(poly[1])
    for i in range(0, len(poly)):
        alig = (Points[cam[i] - 1][0] * (Points[cam[i + 1] - 1][1] - Points[cam[i + 2] - 1][1]) + Points[cam[i + 1] - 1][0] *
                (Points[cam[i + 2] - 1][1] - Points[cam[i] - 1][1]) + Points[cam[i + 2] - 1][0] * (Points[cam[i] - 1][1] - Points[cam[i + 1] - 1][1]))
        if alig == 0:
            break
    return alig

def Segments(poly):
    n = len(poly)
    lad = []
    for i in range(0, len(poly) - 1):
        lad.append([Points[poly[i] - 1], Points[poly[i + 1] - 1]])
    lad.append([Points[poly[n - 1] - 1], Points[poly[0] - 1]])
    seg = False
    m = len(lad)
    for i in range(0, m - 1):
        if seg:
            break
        for j in range(i, m):
            seg = Intersection(lad[i], lad[j])
            if seg:
                break
    return seg

def Holes(poly, H):
    int2 = False
    n = len(H)
    for i in range(0, n - 1):
        m = Medio(Points[H[i] - 1], Points[H[i + 1] - 1])
        if PointIn(m, poly):
            if not AlignedPol(m, poly):
                int2 = True
                break
    m = Medio(Points[H[n - 1] - 1], Points[H[0] - 1])
    if PointIn(m, poly):
        if not AlignedPol(m, poly):
            int2 = True
    return int2

def SidesPoints(poly):
    int2 = False
    for i in range(0, len(PointsP)):
        int2 = (PointIn(Points[PointsP[i] - 1], poly) == True and AlignedPol(Points[PointsP[i] - 1], poly) == False)
        if int2:
            break
    return int2

def SidesSegments(poly):
    seg = False
    for i in range(0, len(SegmentsP)):
        if seg:
            break
        n = len(SegmentsP[i])
        for j in range(0, n - 1):
            m = Medio(Points[SegmentsP[i][j] - 1], Points[SegmentsP[i][j + 1] - 1])
            if PointIn(m, poly):
                if not AlignedPol(m, poly):
                    seg = True
                    break
        m = Medio(Points[SegmentsP[i][n - 1] - 1], Points[SegmentsP[i][0] - 1])
        if PointIn(m, poly):
            if not AlignedPol(m, poly):
                seg = True
    return seg

def Polygons(point1, point2, distance, matrix):
    aristas = []
    poligono = []
    polig = []
    aristas.append([point1])
    if matrix[point1 - 1][point2 - 1] == 1:
        for i in range(0, distance):
            temp = []
            for k in range(0, len(aristas)):
                ultimo = aristas[k][i]
                if ultimo != point2:
                    for j in range(0, len(matrix)):
                        if matrix[ultimo - 1][j - 1] == 1:
                            if j not in aristas[k]:
                                aristas[k].append(j)
                                temp.extend([aristas[k].copy()])
                                aristas[k].pop()
            aristas = temp.copy()

        temp = []
        for k in range(0, len(aristas)):
            if aristas[k][distance] == point2:
                if not Segments(aristas[k]):
                    if Aligned(aristas[k]) != 0:
                        temp.append(aristas[k])

        for i in range(0, len(temp)):
            if not SidesPoints(temp[i]):
                if not SidesSegments(temp[i]):
                    poligono.append(temp[i])

        if HolesP:
            polig = []
            for i in range(0, len(poligono)):
                aguj = 0
                for j in range(0, len(HolesP)):
                    if not Holes(poligono[i], HolesP[j]):
                        aguj = aguj + 1
                if aguj == len(HolesP):
                    polig.append(poligono[i])
        if not HolesP:
            polig = []
            for i in range(0, len(poligono)):
                polig.append(poligono[i])
    return polig

def Duplicates(polygons):
    aux = set()
    final = []
    for i in range(0, len(polygons)):
        if frozenset(polygons[i]) not in aux:
            final.append(polygons[i])
            aux.add(frozenset(polygons[i]))
    return final

def Update(polygons, fun):
    upd = []
    maxi = 0
    for i in range(0, len(polygons)):
        f = Function(polygons[i], fun)
        if f >= maxi:
            upd.append(polygons[i].copy())
        if f > maxi:
            maxi = f
            upd = [polygons[i].copy()]
    return upd

def Function(poly, fun):
    n = len(poly)
    function = 0
    if fun == 0:
        for i in range(1, n):
            function = function + round(np.linalg.det(np.array([Points[poly[i - 1] - 1], Points[poly[i] - 1]])))
        function = function + round(np.linalg.det(np.array([Points[poly[n - 1] - 1], Points[poly[0] - 1]])))
        function = np.abs(0.5 * function)
    if fun == 1:
        for i in range(1, n):
            function = function + np.sqrt(((Points[poly[i - 1] - 1][1] - Points[poly[i] - 1][1]) ** 2) +
                        ((Points[poly[i - 1] - 1][0] - Points[poly[i] - 1][0]) ** 2))
        function = round(function + np.sqrt(((Points[poly[n - 1] - 1][1] - Points[poly[0] - 1][1]) ** 2) + (
                    (Points[poly[n - 1] - 1][0] - Points[poly[0] - 1][0]) ** 2)), 12)
    return function

def Solution(N, distance, matrix, fun):
    pol = []
    for i in range(0, N - 1):
        for j in range(i + 2, N + 1):
            aux = Polygons(i + 1, j, distance, matrix).copy()
            pol = [*map(list, list(set(map(tuple, pol)) | set(map(tuple, aux))))].copy()
    solution = Duplicates(Update(pol, fun))
    solution.sort()
    return solution

def Rect(poly):
    rect = True
    pol = poly.copy()
    pol.append(poly[0])
    pol.append(poly[1])
    for i in range(1, len(pol) - 1):
        temp1 = Points[pol[i - 1] - 1]
        temp2 = Points[pol[i] - 1]
        temp3 = Points[pol[i + 1] - 1]
        p1 = [temp3[0] - temp2[0], temp3[1] - temp2[1]]
        p2 = [temp2[0] - temp1[0], temp2[1] - temp1[1]]
        ang = Angle(p1, p2)
        if np.abs(ang) != np.pi / 2:
            rect = False
    return rect

def Rectangle(N, matrix, fun):
    pol = []
    poly = []
    for i in range(0, N - 1):
        for j in range(i + 2, N + 1):
            aux = Polygons(i + 1, j, 3, matrix).copy()
            pol = [*map(list, list(set(map(tuple, pol)) | set(map(tuple, aux))))].copy()

    for i in range (0, len(pol)):
        if Rect(pol[i]) == True:
            poly.append(pol[i])
    rectangle = Duplicates(Update(poly, fun))
    return rectangle

matrix = Matrix(Points)
print(matrix)
N = 49

print("----------------------")
start = time()
print("Triangle =", Solution(N, 2, matrix, 0))
end = time() - start
print("Time:", end, "seg")
print("----------------------")

start = time()
print("Quadrilateral =", Solution(N, 3, matrix, 0))
end = time() - start
print("Time:", end, "seg")
print("----------------------")

start = time()
print("Rectangle = ", Rectangle(N, matrix, 0))
end = time() - start
print("Time:", end, "seg")
print("----------------------")

start = time()
print("Pentagon = ", Solution(N, 4, matrix, 0))
end = time() - start
print("Time:", end, "seg")
print("----------------------")

start = time()
print("Hexagon =", Solution(N, 5, matrix, 0))
end = time() - start
print("Time:", end, "seg")
print("----------------------")
