import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

// 0 = AREA, 1 = PERIMETER

public class PSH {

	static ArrayList<Integer> point1 = new ArrayList<Integer>(Arrays.asList(5,9));
	static ArrayList<Integer> point2 = new ArrayList<Integer>(Arrays.asList(6,8));
	static ArrayList<Integer> point3 = new ArrayList<Integer>(Arrays.asList(7,8));
	static ArrayList<Integer> point4 = new ArrayList<Integer>(Arrays.asList(8,6));
	static ArrayList<Integer> point5 = new ArrayList<Integer>(Arrays.asList(7,4));
	static ArrayList<Integer> point6 = new ArrayList<Integer>(Arrays.asList(8,2));
	static ArrayList<Integer> point7 = new ArrayList<Integer>(Arrays.asList(7,1));
	static ArrayList<Integer> point8 = new ArrayList<Integer>(Arrays.asList(6,1));
	static ArrayList<Integer> point9 = new ArrayList<Integer>(Arrays.asList(4,0));
	static ArrayList<Integer> point10 = new ArrayList<Integer>(Arrays.asList(3,1));
	static ArrayList<Integer> point11 = new ArrayList<Integer>(Arrays.asList(2,1));
	static ArrayList<Integer> point12 = new ArrayList<Integer>(Arrays.asList(2,2));
	static ArrayList<Integer> point13 = new ArrayList<Integer>(Arrays.asList(2,3));
	static ArrayList<Integer> point14 = new ArrayList<Integer>(Arrays.asList(1,4));
	static ArrayList<Integer> point15 = new ArrayList<Integer>(Arrays.asList(1,5));
	static ArrayList<Integer> point16 = new ArrayList<Integer>(Arrays.asList(2,6));
	static ArrayList<Integer> point17 = new ArrayList<Integer>(Arrays.asList(3,8));
	static ArrayList<Integer> point18 = new ArrayList<Integer>(Arrays.asList(4,8));
	static ArrayList<Integer> point19 = new ArrayList<Integer>(Arrays.asList(5,8));
	static ArrayList<Integer> point20 = new ArrayList<Integer>(Arrays.asList(3,7));
	static ArrayList<Integer> point21 = new ArrayList<Integer>(Arrays.asList(4,7));
	static ArrayList<Integer> point22 = new ArrayList<Integer>(Arrays.asList(5,7));
	static ArrayList<Integer> point23 = new ArrayList<Integer>(Arrays.asList(6,7));
	static ArrayList<Integer> point24 = new ArrayList<Integer>(Arrays.asList(7,7));
	static ArrayList<Integer> point25 = new ArrayList<Integer>(Arrays.asList(3,6));
	static ArrayList<Integer> point26 = new ArrayList<Integer>(Arrays.asList(4,6));
	static ArrayList<Integer> point27 = new ArrayList<Integer>(Arrays.asList(5,6));
	static ArrayList<Integer> point28 = new ArrayList<Integer>(Arrays.asList(7,6));
	static ArrayList<Integer> point29 = new ArrayList<Integer>(Arrays.asList(2,5));
	static ArrayList<Integer> point30 = new ArrayList<Integer>(Arrays.asList(3,5));
	static ArrayList<Integer> point31 = new ArrayList<Integer>(Arrays.asList(4,5));
	static ArrayList<Integer> point32 = new ArrayList<Integer>(Arrays.asList(5,5));
	static ArrayList<Integer> point33 = new ArrayList<Integer>(Arrays.asList(6,5));
	static ArrayList<Integer> point34 = new ArrayList<Integer>(Arrays.asList(7,5));
	static ArrayList<Integer> point35 = new ArrayList<Integer>(Arrays.asList(2,4));
	static ArrayList<Integer> point36 = new ArrayList<Integer>(Arrays.asList(3,4));
	static ArrayList<Integer> point37 = new ArrayList<Integer>(Arrays.asList(4,4));
	static ArrayList<Integer> point38 = new ArrayList<Integer>(Arrays.asList(5,4));
	static ArrayList<Integer> point39 = new ArrayList<Integer>(Arrays.asList(6,4));
	static ArrayList<Integer> point40 = new ArrayList<Integer>(Arrays.asList(3,3));
	static ArrayList<Integer> point41 = new ArrayList<Integer>(Arrays.asList(4,3));
	static ArrayList<Integer> point42 = new ArrayList<Integer>(Arrays.asList(7,3));
	static ArrayList<Integer> point43 = new ArrayList<Integer>(Arrays.asList(3,2));
	static ArrayList<Integer> point44 = new ArrayList<Integer>(Arrays.asList(4,2));
	static ArrayList<Integer> point45 = new ArrayList<Integer>(Arrays.asList(5,2));
	static ArrayList<Integer> point46 = new ArrayList<Integer>(Arrays.asList(6,2));
	static ArrayList<Integer> point47 = new ArrayList<Integer>(Arrays.asList(7,2));
	static ArrayList<Integer> point48 = new ArrayList<Integer>(Arrays.asList(4,1));
	static ArrayList<Integer> point49 = new ArrayList<Integer>(Arrays.asList(5,1));

	static ArrayList<ArrayList<Integer>> Points = new ArrayList<ArrayList<Integer>>() {
		{
			add(point1);
			add(point2);
			add(point3);
			add(point4);
			add(point5);
			add(point6);
			add(point7);
			add(point8);
			add(point9);
			add(point10);
			add(point11);
			add(point12);
			add(point13);
			add(point14);
			add(point15);
			add(point16);
			add(point17);
			add(point18);
			add(point19);
			add(point20);
			add(point21);
			add(point22);
			add(point23);
			add(point24);
			add(point25);
			add(point26);
			add(point27);
			add(point28);
			add(point29);
			add(point30);
			add(point31);
			add(point32);
			add(point33);
			add(point34);
			add(point35);
			add(point36);
			add(point37);
			add(point38);
			add(point39);
			add(point40);
			add(point41);
			add(point42);
			add(point43);
			add(point44);
			add(point45);
			add(point46);
			add(point47);
			add(point48);
			add(point49);
		}
	};

	static ArrayList<Integer> Polygon = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18));
	static ArrayList<Integer> PointsP = new ArrayList<Integer>(Arrays.asList(33,43,48));
	static ArrayList<Integer> SegmentsP1 = new ArrayList<Integer>(Arrays.asList(20,25,30,36));
	static ArrayList<Integer> SegmentsP2 = new ArrayList<Integer>(Arrays.asList(21,25,29));
	static ArrayList<ArrayList<Integer>> SegmentsP = new ArrayList<ArrayList<Integer>>() {
		{
			add(SegmentsP1);
			add(SegmentsP2);
		}
	};
	static ArrayList<Integer> HolesP1 = new ArrayList<Integer>(Arrays.asList(23,28,34,27));
	static ArrayList<Integer> HolesP2 = new ArrayList<Integer>(Arrays.asList(38,42,45,41));
	static ArrayList<ArrayList<Integer>> HolesP = new ArrayList<ArrayList<Integer>>() {
		{
			add(HolesP1);
			add(HolesP2);
		}
	};

	public static void main(String[] args) {
		long start, end;
		double time;

		int N = 49;

		start = System.currentTimeMillis();
		ArrayList<ArrayList<Integer>> matrix;
		matrix = Matrix(Points);
		System.out.println(matrix);
		end = System.currentTimeMillis();
		time = (double) ((end - start));
		System.out.println("Matrix = " + time);
		System.out.println("---------------------");

		start = System.currentTimeMillis();
		System.out.println("Triangle = " + Solution(N, 2, matrix, 0));
		end = System.currentTimeMillis();
		time = (double) ((end - start));
		System.out.println("Time = " + time/1000 + " seg");
		System.out.println("---------------------");

		start = System.currentTimeMillis();
		System.out.println("Quadrilateral = " + Solution(N, 3, matrix, 0));
		end = System.currentTimeMillis();
		time = (double) ((end - start));
		System.out.println("Time = " + time/1000 + " seg");
		System.out.println("---------------------");

		start = System.currentTimeMillis();
		System.out.println("Rectangle = " + Rectangle(N, matrix, 0));
		end = System.currentTimeMillis();
		time = (double) ((end - start));
		System.out.println("Time = " + time/1000 + " seg");
		System.out.println("---------------------");

		start = System.currentTimeMillis();
		System.out.println("Pentagon = " + Solution(N, 4, matrix, 0));
		end = System.currentTimeMillis();
		time = (double) ((end - start));
		System.out.println("Time = " + time/1000 + " seg");
		System.out.println("---------------------");

		start = System.currentTimeMillis();
		System.out.println("Hexagon = " + Solution(N, 5, matrix, 0));
		end = System.currentTimeMillis();
		time = (double) ((end - start));
		System.out.println("Time = " + time/1000 + " seg");
		System.out.println("---------------------");
	}

	static int Direction(ArrayList<Integer> p, ArrayList<Integer> q, ArrayList<Integer> r) {
		int dire;
		dire = (q.get(0) - p.get(0)) * (r.get(1) - p.get(1)) - (r.get(0) - p.get(0)) * (q.get(1) - p.get(1));
		return dire;
	}

	static boolean Alignedp(ArrayList<Integer> p, ArrayList<Integer> q, ArrayList<Integer> r) {
		boolean alinp;
		alinp = Math.min(p.get(0), q.get(0)) <= r.get(0) && r.get(0) <= Math.max(p.get(0), q.get(0))
				&& Math.min(p.get(1), q.get(1)) <= r.get(1) && r.get(1) <= Math.max(p.get(1), q.get(1));
		return alinp;
	}

	static boolean Intersection(ArrayList<ArrayList<Integer>> l1, ArrayList<ArrayList<Integer>> l2) {
		boolean inter = false;
		ArrayList<Integer> p1 = new ArrayList<>(l1.get(0));
		ArrayList<Integer> p2 = new ArrayList<>(l1.get(1));
		ArrayList<Integer> p3 = new ArrayList<>(l2.get(0));
		ArrayList<Integer> p4 = new ArrayList<>(l2.get(1));
		int d1 = Direction(p3, p4, p1);
		int d2 = Direction(p3, p4, p2);
		int d3 = Direction(p1, p2, p3);
		int d4 = Direction(p1, p2, p4);
		if ((!p1.get(0).equals(p3.get(0)) || !p1.get(1).equals(p3.get(1))) &&
				(!p1.get(0).equals(p4.get(0)) || !p1.get(1).equals(p4.get(1))) &&
				(!p2.get(0).equals(p3.get(0)) || !p2.get(1).equals(p3.get(1))) &&
				(!p2.get(0).equals(p4.get(0)) || !p2.get(1).equals(p4.get(1)))) {
			if (((d1 > 0 && d2 < 0) || (d1 < 0 && d2 > 0)) && ((d3 > 0 && d4 < 0) || (d3 < 0 && d4 > 0))) {
				inter = true;
			} else {
				if (d1 == 0 && Alignedp(p3, p4, p1) || d2 == 0 &&
						Alignedp(p3, p4, p2) || d3 == 0 &&
						Alignedp(p1, p2, p3) || d4 == 0 &&
						Alignedp(p1, p2, p4) ) {
					inter = true;
				}
			}
		}
		return inter;
	}

	static boolean AlignedPol(ArrayList<Integer> p, ArrayList<Integer> poly) {
		boolean alin = false;
		int temp1, temp2;
		ArrayList<Integer> lad = new ArrayList<>(poly);
		lad.add(poly.get(0));
		for (int i = 0; i <lad.size()-1; i++) {
			temp1 = lad.get(i)-1;
			temp2 = lad.get(i+1)-1;
			if(Direction(Points.get(temp1), Points.get(temp2),p) == 0 && Alignedp(Points.get(temp1), Points.get(temp2), p)) {
				alin = true;
				break;
			}
		}
		return alin;
	}

	static double Angle(ArrayList<Integer> u, ArrayList<Integer> v) {
		ArrayList<Integer> p3 = new ArrayList<>(Arrays.asList(0, 0));
		double angle = 0;
		if(u.get(0) * u.get(0) + u.get(1) * u.get(1) != 0 &&
				v.get(0) * v.get(0) + v.get(1) * v.get(1) != 0) {
			angle = GetAngleABC(u, v, p3);
		}
		return angle;
	}

	static boolean PointIn(ArrayList<Integer> p, ArrayList<Integer> poly) {
		boolean point;
		ArrayList<Integer> temp1, temp2;
		int temp3, temp4;
		ArrayList<Integer> p1,p2;

		if(AlignedPol(p, poly)) {
			point = true;
		}else {
			point = false;
			double suma = 0;
			for (int i = 0; i <poly.size() - 1; i++) {
				temp1 = Points.get(poly.get(i) - 1);
				temp2 = Points.get(poly.get(i+1) - 1);
				temp3 = p.get(0);
				temp4 = p.get(1);
				p1 = new ArrayList<>(Arrays.asList(temp1.get(0) - temp3, temp1.get(1) - temp4));
				p2 = new ArrayList<>(Arrays.asList(temp2.get(0) - temp3, temp2.get(1) - temp4));
				suma = suma + Angle(p1, p2);
			}
			temp1 = Points.get(poly.get(poly.size()-1)-1);
			temp2 = Points.get(poly.get(0)-1);
			temp3 = p.get(0);
			temp4 = p.get(1);
			p1 = new ArrayList<>(Arrays.asList(temp1.get(0) - temp3, temp1.get(1) - temp4));
			p2= new ArrayList<>(Arrays.asList(temp2.get(0) - temp3, temp2.get(1) - temp4));
			suma = suma + Angle(p1, p2);
			if(Math.abs(suma) >= Math.PI) {
				point = true;
			}
		}
		return point;
	}

	static ArrayList<ArrayList<ArrayList<Integer>>> SidesPol(ArrayList<Integer> poly ) {
		ArrayList<ArrayList<ArrayList<Integer>>> lad = new ArrayList<>();
		ArrayList<Integer> punto1aux;
		ArrayList<Integer> punto2aux;
		ArrayList<ArrayList<Integer>> puntosaux;
		ArrayList<Integer> temp1, temp2;
		for (int i = 0; i < poly.size() - 1; i++) {
			temp1 = Points.get(poly.get(i) - 1);
			temp2 = Points.get(poly.get(i + 1) - 1);
			punto1aux = new ArrayList<>();
			punto1aux.add(temp1.get(0));
			punto1aux.add(temp1.get(1));
			punto2aux = new ArrayList<>();
			punto2aux.add(temp2.get(0));
			punto2aux.add(temp2.get(1));
			puntosaux = new ArrayList<>();
			puntosaux.add(punto1aux);
			puntosaux.add(punto2aux);
			lad.add(puntosaux);
		}
		punto1aux = new ArrayList<>();
		temp1 = Points.get(poly.get(poly.size() - 1) - 1);
		temp2 = Points.get(poly.get(0) - 1);
		punto1aux.add(temp1.get(0));
		punto1aux.add(temp1.get(1));
		punto2aux = new ArrayList<>();
		punto2aux.add(temp2.get(0));
		punto2aux.add(temp2.get(1));
		puntosaux = new ArrayList<>();
		puntosaux.add(punto1aux);
		puntosaux.add(punto2aux);
		lad.add(puntosaux);
		return lad;
	}

	static ArrayList<BigDecimal> MedioBig(ArrayList<Integer> p, ArrayList<Integer> q) {
		ArrayList<BigDecimal> m = new ArrayList<>();
		m.add(BigDecimal.valueOf((p.get(0) + q.get(0)) / 2.0));
		m.add(BigDecimal.valueOf((p.get(1) + q.get(1)) / 2.0));
		return m;
	}

	static ArrayList<BigDecimal> IntersectionpBig(ArrayList<ArrayList<Integer>> l1, ArrayList<ArrayList<Integer>> l2) {
		ArrayList<Integer> u1 = new ArrayList<>();
		ArrayList<Integer> u2 = new ArrayList<>();
		ArrayList<BigDecimal> p = new ArrayList<>();
		float a, b, c, d, e, f;
		ArrayList<Integer> temp1, temp2, temp3, temp4;
		temp1 = l1.get(1);
		temp2 = l1.get(0);
		temp3 = l2.get(1);
		temp4 = l2.get(0);
		u1.add(temp1.get(0) - temp2.get(0));
		u1.add(temp1.get(1) - temp2.get(1));
		u2.add(temp3.get(0) - temp4.get(0));
		u2.add(temp3.get(1) - temp4.get(1));
		boolean coinc = u1.get(0) * u2.get(1) == u1.get(1) * u2.get(0);
		if(!coinc) {
			if(Intersection(l1, l2)) {
				a = temp1.get(1) - temp2.get(1);
				b = temp2.get(0) - temp1.get(0);
				c = (temp2.get(0) * temp1.get(1)) - (temp1.get(0) * temp2.get(1));
				d = temp3.get(1) - temp4.get(1);
				e = temp4.get(0) - temp3.get(0);
				f = (temp4.get(0) * temp3.get(1)) - (temp3.get(0) * temp4.get(1));
				if(temp2.get(0).equals(temp1.get(0))) {
					p.add(new BigDecimal(c/a));
					p.add(BigDecimal.valueOf((a * f - c * d) / (a * e)));
				}else {
					if(temp2.get(1).equals(temp1.get(1))) {
						p.add(BigDecimal.valueOf((b * f - c * e) / (b * d)));
						p.add(new BigDecimal(c/b));
					}else {
						p.add(BigDecimal.valueOf((b * f - c * e) / (b * d - a * e)));
						p.add(BigDecimal.valueOf((a * f - c * d) / (a * e - b * d)));
					}
				}
			}
		}else {
			p.add(new BigDecimal(temp4.get(0)));
			p.add(new BigDecimal(temp4.get(1)));
		}
		return p;
	}

	static boolean IntersectionPoly(ArrayList<ArrayList<Integer>> l, ArrayList<ArrayList<Integer>> side, ArrayList<Integer> poly, int num) {
		ArrayList<BigDecimal> p;
		ArrayList<BigDecimal> m1 = new ArrayList<>();
		ArrayList<BigDecimal> m2 = new ArrayList<>();
		BigDecimal a, b, c;
		boolean int2 = false;
		BigDecimal eps = BigDecimal.valueOf(1 / 100000.0);
		ArrayList<Integer> temp1, temp2;
		BigDecimal temp3, temp4;
		temp1 = l.get(0);
		temp2 = l.get(1);
		if(Intersection(l, side)) {
			p = IntersectionpBig(l, side);
			temp3 = p.get(0);
			temp4 = p.get(1);
			if(temp1.get(0).equals(temp2.get(0))) {
				m1.add(new BigDecimal(temp1.get(0)));
				m1.add(BigDecimal.valueOf(temp4.floatValue() - eps.floatValue()));
				m2.add(new BigDecimal(temp1.get(0)));
				m2.add(BigDecimal.valueOf(temp4.floatValue() + eps.floatValue()));
			}else {
				if(temp1.get(1).equals(temp2.get(1))) {
					m1.add(BigDecimal.valueOf(temp3.floatValue() - eps.floatValue()));
					m1.add(new BigDecimal(temp1.get(1)));
					m2.add(BigDecimal.valueOf(temp3.floatValue() + eps.floatValue()));
					m2.add(new BigDecimal(temp1.get(1)));
				}else {
					a = new BigDecimal(temp2.get(1)-temp1.get(1));
					b = new BigDecimal(temp1.get(0)-temp2.get(0));
					c = new BigDecimal((temp1.get(0)*temp2.get(1))-(temp2.get(0)*temp1.get(1)));
					m1.add(BigDecimal.valueOf(temp3.floatValue() - eps.floatValue()));
					BigDecimal aux = BigDecimal.valueOf(temp3.floatValue() - eps.floatValue());
					BigDecimal aux2 = a.multiply(aux);
					BigDecimal aux3 = c.subtract(aux2);
					BigDecimal aux4 = aux3.divide(b, MathContext.DECIMAL128);
					m1.add(aux4);
					m2.add(BigDecimal.valueOf(temp3.floatValue() + eps.floatValue()));
					BigDecimal auxb = BigDecimal.valueOf(temp3.floatValue() + eps.floatValue());
					BigDecimal aux2b = a.multiply(auxb);
					BigDecimal aux3b = c.subtract(aux2b);
					BigDecimal aux4b = aux3b.divide(b, MathContext.DECIMAL128);
					m2.add(aux4b);
				}
			}
			if(num == 0) {
				if(!PointInBig(m1, poly) || !PointInBig(m2, poly)) {
					int2 = true;
				}
			}
			if(num == 1) {
				if((PointInBig(m1, poly) && !AlignedPolBig(m1, poly)) ||
						(PointInBig(m2, poly) && !AlignedPolBig(m2, poly))) {
					int2 = true;
				}
			}
		}
		return int2;
	}

	static boolean IntersectionPol(ArrayList<ArrayList<Integer>> l) {
		boolean inter = false;
		ArrayList<ArrayList<ArrayList<Integer>>> hol;
		ArrayList<ArrayList<ArrayList<Integer>>> sides;
		ArrayList<ArrayList<Integer>> s;
		ArrayList<BigDecimal> p;
		sides = SidesPol(Polygon);
		for (int i = 0; i < sides.size(); i++) {
			inter = IntersectionPoly(l, sides.get(i), Polygon, 0);
			if(inter) {
				break;
			}
		}
		if(!inter) {
			if(!SegmentsP.isEmpty()) {
				for (int i = 0; i < SegmentsP.size(); i++) {
					if(inter) {
						break;
					}
					int n = SegmentsP.get(i).size();
					s = new ArrayList<>();
					s.add(Points.get(SegmentsP.get(i).get(0)-1));
					s.add(Points.get(SegmentsP.get(i).get(n-1)-1));
					if(Intersection(l, s)) {
						p = IntersectionpBig(l,s);
						if((DirectionBig(l.get(0), s.get(0), p) != 0.0)
								&& (DirectionBig(l.get(1), s.get(0), p) != 0.0)
								&& (DirectionBig(l.get(0), s.get(1), p) != 0.0)
								&& (DirectionBig(l.get(1), s.get(1), p) != 0.0)) {
							inter = true;
						}
					}
				}
			}
			if(!HolesP.isEmpty()) {
				for (int i = 0; i < HolesP.size(); i++) {
					hol = SidesPol(HolesP.get(i));
					if (inter) {
						break;
					}
					int agujerosi = HolesP.get(i).size();
					for (int j = 0; j < agujerosi; j++) {
						inter = IntersectionPoly(l, hol.get(j), HolesP.get(i), 1);
						if (inter) {
							break;
						}
					}
				}
			}
		}
		return inter;
	}

	static ArrayList<ArrayList<Integer>> Matrix(ArrayList<ArrayList<Integer>> Points) {
		ArrayList<ArrayList<ArrayList<Integer>>> sides;
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		ArrayList<ArrayList<Integer>>  l;
		ArrayList<BigDecimal> m;
		ArrayList<Integer> temp1, temp2;
		for (int i = 0; i < Points.size(); i++) {
			ArrayList<Integer>  fila = new ArrayList<>();
			for (int j = 0; j < Points.size(); j++) {
				fila.add(0);
			}
			matrix.add(fila);
		}
		sides = SidesPol(Polygon);
		for (int i = 0; i < Points.size() - 1; i++) {
			for (int j = i+1; j < Points.size(); j++) {
				temp1 = Points.get(i);
				temp2 = Points.get(j);
				l = new ArrayList<>();
				l.add(temp1);
				l.add(temp2);
				if(sides.contains(l)) {
					matrix.get(i).set(j, 1);
				}else {
					if(!IntersectionPol(l)) {
						m = MedioBig(temp1, temp2);
						if(PointInBig(m, Polygon)) {
							matrix.get(i).set(j, 1);
						}
					}
				}
			}
		}
		if(!HolesP.isEmpty()) {
			for (int i = 0; i < HolesP.size(); i++) {
				temp1 = HolesP.get(i);
				for (int j = 0; j < temp1.size() - 1; j++) {
					for (int k = 0; k < temp1.size(); k++) {
						m = MedioBig(Points.get(temp1.get(j) - 1), Points.get(temp1.get(k) - 1));
						if(!AlignedPolBig(m, temp1)) {
							matrix.get(temp1.get(j) - 1).set(temp1.get(k) - 1,0);
						}
					}
				}
			}
		}
		for (int i = 0; i < Points.size(); i++) {
			for (int j = 0; j < Points.size(); j++) {
				matrix.get(j).set(i, matrix.get(i).get(j));
			}
		}
		return matrix;
	}

	static int Aligned(ArrayList<Integer> poly) {
		int alig = -1;
		ArrayList<Integer> temp1,temp2,temp3;
		ArrayList<Integer> cam = new ArrayList<>(poly);
		cam.add(poly.get(0));
		cam.add(poly.get(1));
		for (int i = 0; i < poly.size(); i++) {
			temp1 = Points.get(cam.get(i) - 1);
			temp2 = Points.get(cam.get(i + 1) - 1);
			temp3 = Points.get(cam.get(i + 2) - 1);
			alig = temp1.get(0) * (temp2.get(1) - temp3.get(1))
					+ temp2.get(0) * (temp3.get(1) - temp1.get(1))
					+ temp3.get(0) * (temp1.get(1) - temp2.get(1));
			if (alig == 0) {
				break;
			}
		}
		return alig;
	}

	static boolean Segments(ArrayList<Integer> poly) {
		ArrayList<ArrayList<ArrayList<Integer>>> lad = new ArrayList<>();
		ArrayList<ArrayList<Integer>> puntos;
		ArrayList<Integer> punto1;
		ArrayList<Integer> punto2;
		ArrayList<Integer> temp1,temp2;
		for (int i = 0; i < poly.size() - 1; i++) {
			temp1 = Points.get(poly.get(i) - 1);
			temp2 = Points.get(poly.get(i + 1) - 1);
			punto1 = new ArrayList<>();
			punto1.add(temp1.get(0));
			punto1.add(temp1.get(1));
			punto2 = new ArrayList<>();
			punto2.add(temp2.get(0));
			punto2.add(temp2.get(1));
			puntos = new ArrayList<>();
			puntos.add(punto1);
			puntos.add(punto2);
			lad.add(puntos);
		}
		temp1 = Points.get(poly.get(poly.size() - 1) - 1);
		temp2 = Points.get(poly.get(0) - 1);
		punto1 = new ArrayList<>();
		punto1.add(temp1.get(0));
		punto1.add(temp1.get(1));
		punto2 = new ArrayList<>();
		punto2.add(temp2.get(0));
		punto2.add(temp2.get(1));
		puntos = new ArrayList<>();
		puntos.add(punto1);
		puntos.add(punto2);
		lad.add(puntos);

		boolean seg = false;
		for (int i = 0; i < lad.size() - 1; i++) {
			if (seg) {
				break;
			}
			for (int j = i; j < lad.size(); j++) {
				seg = Intersection(lad.get(i), lad.get(j));
				if (seg) {
					break;
				}
			}
		}
		return seg;
	}

	static boolean Holes(ArrayList<Integer> poly, ArrayList<Integer> H) {
		boolean int2 = false;
		ArrayList<Integer> hol = new ArrayList<>(H);
		hol.add(H.get(0));
		ArrayList<BigDecimal> m;
		int n = hol.size();
		for (int i = 0; i < n - 1; i++) {
			m = MedioBig(Points.get(hol.get(i) - 1), Points.get(hol.get(i+1) - 1));
			if (PointInBig(m, poly)) {
				if (!AlignedPolBig(m, poly)) {
					int2 = true;
					break;
				}
			}
		}
		return int2;
	}

	static boolean SidesPoints(ArrayList<Integer> poly) {
		boolean int2 = false;
		if (!PointsP.isEmpty()) {
			for (int i = 0; i < PointsP.size(); i++) {
				int2 = (PointIn(Points.get(PointsP.get(i) - 1), poly) && !AlignedPol(Points.get(PointsP.get(i) - 1), poly));
				if (int2) {
					break;
				}
			}
		}
		return int2;
	}

	static boolean SidesSegments(ArrayList<Integer> poly) {
		ArrayList<BigDecimal> m;
		boolean seg = false;
		if (!SegmentsP.isEmpty()) {
			for (int i = 0; i < SegmentsP.size(); i++) {
				if (seg) {
					break;
				}
				int n = SegmentsP.get(i).size();
				for (int j = 0; j < n - 1; j++) {
					m = MedioBig(Points.get(SegmentsP.get(i).get(j) - 1), Points.get(SegmentsP.get(i).get(j + 1) - 1));
					if (PointInBig(m, poly)) {
						if (!AlignedPolBig(m, poly)) {
							seg = true;
							break;
						}
					}
				}
				m = MedioBig(Points.get(SegmentsP.get(i).get(n-1) - 1), Points.get(SegmentsP.get(i).get(0) - 1));
				if (PointInBig(m, poly)) {
					if (!AlignedPolBig(m, poly)) {
						seg = true;
					}
				}
			}
		}
		return seg;
	}

	static ArrayList<ArrayList<Integer>> Polygons(int point1, int point2, int distance, ArrayList<ArrayList<Integer>> matrix) {
		ArrayList<ArrayList<Integer>> poligono = new ArrayList<>();
		ArrayList<ArrayList<Integer>> polig = new ArrayList<>();
		ArrayList<ArrayList<Integer>> aristas = new ArrayList<>();
		ArrayList<ArrayList<Integer>> temp = null;
		int ultimo, aguj;
		ArrayList<Integer> temp1;
		aristas.add(new ArrayList<>());
		aristas.get(0).add(point1);
		if (matrix.get(point1 - 1).get(point2 - 1) == 1) {
			for (int i = 0; i < distance; i++) {
				temp = new ArrayList<>();
				for (int k = 0; k < aristas.size(); k++) {
					temp1 = aristas.get(k);
					ultimo = temp1.get(i);
					if (ultimo != point2) {
						for (int j = 1; j < matrix.size()+1; j++) {
							if (matrix.get(ultimo - 1).get(j - 1) == 1 && !temp1.contains(j)) {
								temp1.add(j);
								temp.add((ArrayList<Integer>) temp1.clone());
								temp1.remove(temp1.size() - 1);
							}
						}
					}
				}
				aristas.clear();
				aristas.addAll(temp);
			}
			temp.clear();
			for (int k = 0; k < aristas.size(); k++) {
				temp1 = aristas.get(k);
				if (temp1.get(distance) == point2 && Aligned(temp1) != 0
						&& !Segments(temp1)) {
					temp.add(temp1);
				}
			}

			for (int i = 0; i < temp.size(); i++) {
				if (!SidesPoints(temp.get(i)) && !SidesSegments(temp.get(i))) {
					poligono.add(temp.get(i));
				}
			}

			if (!HolesP.isEmpty()) {
				for (int i = 0; i < poligono.size(); i++) {
					aguj = 0;
					for (int j = 0; j < HolesP.size(); j++) {
						if (!Holes(poligono.get(i), HolesP.get(j))) {
							aguj = aguj + 1;
						}
					}
					if (aguj == HolesP.size()) {
						polig.add(poligono.get(i));
					}
				}
			}
			else {
				for (int i = 0; i < poligono.size(); i++) {
					polig.add(poligono.get(i));
				}
			}
		}
		return polig;
	}

	static ArrayList<ArrayList<Integer>> Duplicates(ArrayList<ArrayList<Integer>> polygons) {
		ArrayList<ArrayList<Integer>> dupl = new ArrayList<>();
		ArrayList<ArrayList<Integer>> aux = new ArrayList<>();
		ArrayList<Integer> aux2 = new ArrayList<>();
		for (int i = 0; i < polygons.size(); i++) {
			aux2.addAll(polygons.get(i));
			Collections.sort(aux2);
			if (!aux.contains(aux2)) {
				dupl.add((ArrayList<Integer>) polygons.get(i).clone());
				aux.add((ArrayList<Integer>) aux2.clone());
			}
			aux2.clear();
		}
		return dupl;
	}

	static ArrayList<ArrayList<Integer>> Update(ArrayList<ArrayList<Integer>> polygons, int fun) {
		ArrayList<ArrayList<Integer>> upd = new ArrayList<>();
		double maxi = 0;
		double f;
		ArrayList<Integer> temp1;
		for (int i = 0; i < polygons.size(); i++) {
			temp1 = polygons.get(i);
			f = Function(temp1, fun);
			if (f >= maxi) {
				upd.add(temp1);
			}
			if (f > maxi) {
				upd = new ArrayList<>();
				maxi = f;
				upd.add(temp1);
			}
		}
		return upd;
	}

	static double Function(ArrayList<Integer> poly, int fun) {
		double function = 0;
		ArrayList<Integer> temp1,temp2;
		if (fun == 0) {
			for (int i = 1; i < poly.size(); i++) {
				temp1 = Points.get(poly.get(i - 1) - 1);
				temp2 = Points.get(poly.get(i) - 1);
				function = function + ((temp1.get(0) * temp2.get(1)) - (temp2.get(0) * temp1.get(1)));
			}
			temp1 = Points.get(poly.get(poly.size() - 1) - 1);
			temp2 = Points.get(poly.get(0) - 1);
			function = function + ((temp1.get(0) * temp2.get(1)) - (temp2.get(0) *temp1.get(1)));
			function = Math.abs(0.5 * function);
		}
		if (fun == 1) {
			for (int i = 1; i < poly.size(); i++) {
				temp1 = Points.get(poly.get(i - 1) - 1);
				temp2 = Points.get(poly.get(i) - 1);
				function = (function + Math.sqrt(Math
						.pow(temp1.get(1) - temp2.get(1), 2)
						+ Math.pow(temp1.get(0) - temp2.get(0),
						2)));
			}
			temp1 = Points.get(poly.get(poly.size() - 1) - 1);
			temp2 = Points.get(poly.get(0) - 1);
			function = (function + Math.sqrt(Math
					.pow(temp1.get(1) - temp2.get(1), 2)
					+ Math.pow(temp1.get(0) - temp2.get(0),
					2)));
			function = Math.round(function * 10000000000.0) / 10000000000.0;
		}
		return function;
	}

	static ArrayList<ArrayList<Integer>> Solution(int N, int distance, ArrayList<ArrayList<Integer>> matrix, int fun) {
		ArrayList<ArrayList<Integer>> pol = new ArrayList<>();
		ArrayList<ArrayList<Integer>> solution = new ArrayList<>();
		ArrayList<ArrayList<Integer>> aux;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N + 1; j++) {
				aux = Polygons(i + 1, j, distance, matrix);
				pol = (ArrayList<ArrayList<Integer>>) union(aux, pol);
			}
		}
		solution = Duplicates(Update(pol, fun));
		return solution;
	}

	static boolean Rect(ArrayList<Integer> poly) {
		boolean rect;
		rect = true;
		double ang;
		ArrayList<Integer> poligono = new ArrayList<>(poly);
		poligono.add(poly.get(0));
		poligono.add(poly.get(1));
		ArrayList<Integer> temp1, temp2, temp3;
		ArrayList<Integer> p1, p2;
		for (int i = 1; i < poligono.size()-1; i++) {
			temp1 = Points.get(poligono.get(i-1)-1);
			temp2 = Points.get(poligono.get(i)-1);
			temp3 = Points.get(poligono.get(i+1)-1);
			p1 = new ArrayList<>(Arrays.asList(temp3.get(0) - temp2.get(0), temp3.get(1) - temp2.get(1)));
			p2 = new ArrayList<>(Arrays.asList(temp2.get(0) - temp1.get(0), temp2.get(1) - temp1.get(1)));
			ang = Angle(p1, p2);
			if(Math.abs(ang) != Math.PI/2) {
				rect = false;
			}
		}
		return rect;
	}

	static ArrayList<ArrayList<Integer>> Rectangle(int N, ArrayList<ArrayList<Integer>> matrix, int fun) {
		ArrayList<ArrayList<Integer>> pol = new ArrayList<>();
		ArrayList<ArrayList<Integer>> polig = new ArrayList<>();
		ArrayList<ArrayList<Integer>> rectangle;
		ArrayList<ArrayList<Integer>> aux;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N + 1; j++) {
				aux = Polygons(i + 1, j, 3, matrix);
				pol = (ArrayList<ArrayList<Integer>>) union(aux, pol);
			}
		}
		for (int i = 0; i < pol.size(); i++) {
			if (Rect(pol.get(i))) {
				polig.add(pol.get(i));
			}
		}
		rectangle = Duplicates(Update(polig, fun));
		return rectangle;
	}

	static float DirectionBig(ArrayList<Integer> p, ArrayList<Integer> q, ArrayList<BigDecimal> r) {
		float dire;
		float r0 = r.get(0).floatValue();
		float r1 = r.get(1).floatValue();
		dire = (q.get(0) - p.get(0)) * (r1 - p.get(1)) - (r0 - p.get(0)) * (q.get(1) - p.get(1));
		return dire;
	}

	static boolean AlignedpBig(ArrayList<Integer> p, ArrayList<Integer> q, ArrayList<BigDecimal> r) {
		boolean alinp;
		alinp = Math.min(p.get(0), q.get(0)) <= r.get(0).floatValue() && r.get(0).floatValue() <= Math.max(p.get(0), q.get(0))
				&& Math.min(p.get(1), q.get(1)) <= r.get(1).floatValue() && r.get(1).floatValue() <= Math.max(p.get(1), q.get(1));
		return alinp;
	}

	static boolean AlignedPolBig(ArrayList<BigDecimal> p, ArrayList<Integer> poly) {
		boolean alin = false;
		int temp1, temp2;
		ArrayList<Integer> lad = new ArrayList<>(poly);
		lad.add(poly.get(0));
		for (int i = 0; i <lad.size()-1; i++) {
			temp1=lad.get(i)-1;
			temp2=lad.get(i+1)-1;
			if(DirectionBig(Points.get(temp1), Points.get(temp2),p)==0 &&
					AlignedpBig(Points.get(temp1), Points.get(temp2), p)) {
				alin = true;
				break;
			}
		}
		return alin;
	}

	static double AngleBig(ArrayList<BigDecimal> u,ArrayList<BigDecimal> v) {
		ArrayList<Integer> p3 = new ArrayList<>(Arrays.asList(0, 0));
		double angle = 0;
		float u0,u1,v0,v1;
		u0 = u.get(0).floatValue();
		u1 = u.get(1).floatValue();
		v0 = v.get(0).floatValue();
		v1 = v.get(1).floatValue();
		if(u0*u0+u1*u1 != 0 && v0*v0+v1*v1 != 0) {
			angle = GetAngleABCbig(u, v, p3);
		}
		return angle;
	}

	static double GetAngleABC( ArrayList<Integer> uno,ArrayList<Integer>tres , ArrayList<Integer> dos){
		ArrayList<Integer> ab = new ArrayList<>(Arrays.asList(dos.get(0) - uno.get(0), dos.get(1) - uno.get(1)));
		ArrayList<Integer> cb = new ArrayList<>(Arrays.asList(dos.get(0) - tres.get(0), dos.get(1) - tres.get(1)));
		double dot = (ab.get(0) * cb.get(0) + ab.get(1) * cb.get(1));
		double cross = (ab.get(0) * cb.get(1) - ab.get(1) * cb.get(0));
		return Math.atan2(cross, dot);
	}

	static double GetAngleABCbig( ArrayList<BigDecimal> uno,ArrayList<BigDecimal>tres , ArrayList<Integer> dos){
		float uno0,uno1,tres0,tres1;
		uno0 = uno.get(0).floatValue();
		uno1 = uno.get(1).floatValue();
		tres0 = tres.get(0).floatValue();
		tres1 = tres.get(1).floatValue();
		float ab0,ab1,cb0,cb1;
		ab0 = dos.get(0) - uno0;
		ab1 = dos.get(1) - uno1;
		cb0 = dos.get(0) - tres0;
		cb1 = dos.get(1) - tres1;
		double dot = (ab0 * cb0 + ab1 * cb1);
		double cross = (ab0 *cb1 - ab1 * cb0);
		return Math.atan2(cross, dot);
	}

	static boolean PointInBig(ArrayList<BigDecimal> p, ArrayList<Integer> poly) {
		boolean point;
		ArrayList<Integer> temp1, temp2;
		float pd0 = p.get(0).floatValue();
		float pd1 = p.get(1).floatValue();
		float valor1, valor2, valor3, valor4;
		ArrayList<BigDecimal> p1, p2;

		if(AlignedPolBig(p, poly)) {
			point = true;
		}else {
			point = false;
			double suma = 0;
			for (int i = 0; i < poly.size()-1; i++) {
				temp1 = Points.get(poly.get(i)-1);
				temp2 = Points.get(poly.get(i+1)-1);
				valor1 = temp1.get(0)-pd0;
				valor2 = temp1.get(1)-pd1;
				valor3 = temp2.get(0)-pd0;
				valor4 = temp2.get(1)-pd1;
				p1 = new ArrayList<>(Arrays.asList(new BigDecimal(valor1), new BigDecimal(valor2)));
				p2 = new ArrayList<>(Arrays.asList(new BigDecimal(valor3), new BigDecimal(valor4)));
				suma=suma + AngleBig(p1,p2);
			}
			temp1 = Points.get(poly.get(poly.size()-1)-1);
			temp2 = Points.get(poly.get(0)-1);
			valor1 = temp1.get(0)-pd0;
			valor2 = temp1.get(1)-pd1;
			valor3 = temp2.get(0)-pd0;
			valor4 = temp2.get(1)-pd1;
			p1 = new ArrayList<>(Arrays.asList(new BigDecimal(valor1), new BigDecimal(valor2)));
			p2 = new ArrayList<>(Arrays.asList(new BigDecimal(valor3), new BigDecimal(valor4)));
			suma = suma + AngleBig(p1,p2);
			if(Math.abs(suma) >= Math.PI) {
				point = true;
			}
		}
		return point;
	}

	static public <T> List<T> union(ArrayList<T> list1, ArrayList<T> list2) {
		Set<T> set = new HashSet<>();
		set.addAll(list1);
		set.addAll(list2);
		return new ArrayList<>(set);
	}
}