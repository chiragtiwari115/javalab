public class linearsearch
{
	public static int linearsearch(int[] arr,int key){
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==key){
	            return 1;
	        }
	    }
	    return -1;
	}
	public static void main(String[] args){
	  int[] a1={10,20,30,40,50,60,70,80,90};
	  int key=80;
	  linearsearch ob= new linearsearch();
	  int i=ob.linearsearch(a1,key);
	  if(i==1)
	  System.out.println("key not found");
	  else
	  System.out.println(key+"is found at index:"+linearsearch(a1,key));
	}

}