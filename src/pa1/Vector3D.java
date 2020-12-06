package pa1;

public class Vector3D {

	//Declare Variables
	double x, y, z;
	
	//Constructor -> Initialize Variables
	//Required to Give 3 Parameter Values.
	Vector3D(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	//Function -> Get Dot Product From Vector3D Input
	//Formula -> (Vector3D1.x * Vector3D2.x) + (Vector3D1.y * Vector3D2.y) + (Vector3D1.z * Vector3D2.z) 
    public double dot(Vector3D v) {
        return (this.x * v.x) + (this.y * v.y) + (this.z * v.z); 
    }
    
	//Function -> Get Magnitude of this Vector3D
	//Formula -> (x^2) + (y^2) + (z^2)
    public double magnitude() {
        return Math.sqrt( Math.pow((x),2)+ Math.pow((y),2)+ Math.pow((z),2));
    }
	
	//Function -> Scale Vector3D by f
	//Formula -> (f * Vector3D.x), (f * Vector3D.y), (f * Vector3D.z)
    public Vector3D scale(double f) {
    	return new Vector3D(f*x, f*y, f*z);
    }
	
	//Function -> Add Vector3D1 and Vector3D2
	//Formula -> (Vector3D1.x + Vector3D2.x), (Vector3D1.y + Vector3D2.y), (Vector3D1.z + Vector3D2.z)
    public Vector3D add(Vector3D v) {
        return new Vector3D(v.x + this.x, v.y + this.y, v.z + this.z);
    }
	
	//Function -> Subtract Vector3D1 and Vector3D2
	//Formula -> (Vector3D1.x - Vector3D2.x), (Vector3D1.y - Vector3D2.y), (Vector3D1.z - Vector3D2.z)
    public Vector3D subtract(Vector3D v) {
        return new Vector3D(this.x - v.x, this.y - v.y, this.z - v.z);
    }

    // Function -> Negate Vector 
    // Formula -> (-1 * Vector3D.x), (-1 * Vector3D.y), (-1 * Vector3D.z)
    public Vector3D negate() {
        return new Vector3D((-1*x), (-1*y), (-1*z));
    }

    // Return a pretty string 
    public String toString() {
        return "X: " + this.x + " " + "Y: " + this.y + " " + "Z: " + this.z;
    }
    
    // Function -> Test whether vectors are equal 
    public boolean equals(Vector3D v) {
        return this.x == v.x && this.y == v.y && this.z==v.z;
    }
	
}
