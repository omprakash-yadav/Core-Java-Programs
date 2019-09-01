class Test{
public static void main(String[] arg){

            Person p1=new Student();
                 p1.sleeping(5);
                  p1.walking();
                  p1.eating();
      //Person p2=new Players();
                Person p2=new Chessplayer();
                   p2.sleeping(6);
                     p2.walking();
                       p2.eating();
               Person p3=new Cricket();
                   p3.sleeping(7);
                     p3.walking();
                       p3.eating();
             //Person p4=new Employee();
               Person p4=new Govemp();
                   p4.sleeping(7);
                    p4.walking();
                       p4.eating();
                       //p4.working();
                   Employee em1=new Govemp();
                   em1.sleeping(7);
                    em1.walking();
                      em1.eating();
                      em1.working(); 
     Employee em2=new Privateemp();
                   em2.sleeping(7);
                    em2.walking();
                      em2.eating();
                      em2.working(); 
             
             
            



               }
}
abstract class Person{
   abstract void sleeping(int hr);
   abstract void eating();
   abstract void walking();
 }
class Student extends Person{
   void sleeping(int hr){
             System.out.println("Student sleeping(int hr)");
             }
   void walking(){
           System.out.println("Student walking()");
           }
   void eating(){
           System.out.println("Student eating()");
           }
}
abstract class Player extends Person{
   
}
class Cricket extends Player{
          void sleeping(int hr){
                   System.out.println("cricketer sleeping(int hr)");
                       }
          void eating(){
            System.out.println("cricketer eating()");
                     }
           void walking(){
             System.out.println("cricketer walking()");
                   }
}
class Chessplayer extends Player{
          void sleeping(int hr){
                 System.out.println("chessplayer sleeping(int hr)");
                      }
            void eating(){
                 System.out.println("chessplayer eating()");
                     }
             void walking(){
                 System.out.println("chessplyer walking()");
                        }
}
abstract class Employee extends Person{
                     void sleeping(int hr){
                       System.out.println("Employee sleeping()");
                               }
        abstract void walking();
        abstract void working();
}


class Govemp extends Employee{
          void walking(){
                System.out.println("Govemp walking()");
                  }
          void eating(){
           System.out.println("Govemp eating()");
                }
          void working(){
                 System.out.println("Govemp working()");
                 }
}

class Privateemp extends Employee{
               void walking(){
                   System.out.println("Privateemp walking()");
                          }
               void eating(){
                       System.out.println("Privateemp eating()");
                          }
               void working(){
                 System.out.println("Privateemp working()");
                           }
}                 
                                        

  

