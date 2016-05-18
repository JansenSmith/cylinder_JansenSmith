
//create a Cylinder
CSG cylinder = new Cylinder(	10, // Radius at the bottom
                      				20, // Radius at the top
                      				40, // Height
                      			         (int)30 //resolution
                      			          ).toCSG()//convert to CSG to display                    			         ).toCSG()//convert to CSG to display 
  //create a Cylinder
CSG pyramid = new Cylinder(	20, // Radius at the bottom
                      				0, // Radius at the top
                      				40, // Height
                      			         (int)4 //resolution
                      			         ).toCSG()//convert to CSG to display                    			 
                      			         .movex(50)
 return [cylinder ,pyramid]