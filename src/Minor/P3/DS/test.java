package Minor.P3.DS;


import java.util.Vector;

import Minor.P3.Client.Point;
import Minor.P3.DS.prQuadtree.prQuadInternal;
import Minor.P3.DS.prQuadtree.prQuadLeaf;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		prQuadtree<Point> tree = new prQuadtree<Point>(-8, 8, -8, 8);
		
		System.out.println(	tree.insert(new Point(-4,4)) );
		System.out.println(	tree.insert(new Point(-2,4)) );
		System.out.println(	tree.insert(new Point(1,7)) );
		System.out.println(	tree.insert(new Point(2,2)) );
		System.out.println(	tree.insert(new Point(3,7)) );
		System.out.println(	tree.insert(new Point(5,6)) );
		System.out.println(	tree.insert(new Point(-4,-2)) );
		System.out.println(	tree.insert(new Point(2,-4)) );
		System.out.println(	tree.insert(new Point(4,-6)) );
		System.out.println(	tree.insert(new Point(-1,-2)) ); 
		System.out.println(	tree.insert(new Point(1,7)) );
		System.out.println( tree.find(new Point(-2,4)) );
		System.out.println( tree.find(new Point(-2,5)) );
		
		tree.delete(new Point(-2,4));
		System.out.println( tree.find(new Point(-2,4)) );

	}

}
