
//create a Cylinder
CSG cylinder = new Cylinder(	10, // Radius at the top
                      				20, // Radius at the bottom
                      				40, // Height
                      			         (int)30 //resolution
                      			         ).toCSG()//convert to CSG to display
 return cylinder