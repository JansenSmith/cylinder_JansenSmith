double size=40
//create a Cylinder
CSG cylinder = new Cylinder(	size/4, // Radius at the top
                      				size/2, // Radius at the bottom
                      				size, // Height
                      			         (int)80 //resolution
                      			         ).toCSG()