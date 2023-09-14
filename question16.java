//chirag tiwari
//0827CI221047
class question16{
   static int count=0;
   public void increment()
   {
       count++;
   }
   public static void main(String args[])
   {
       question16 obj1=new question16();
       question16 obj2=new question16();
       obj1.increment();
       obj2.increment();
       System.out.println("Obj1: count is="+obj1.count);
       System.out.println("Obj2: count is="+obj2.count);
   }
}