package Array;
class Averageofage{
	public static void main(String args[]){
    int[] ages ={10,20,30,40,50};
    
    float avg , sum =0;
    
    int length = ages.length;
    
    for(int age : ages){
    	sum += age;
    }
    
    avg = sum/length;
    
    System.out.println("The avg of the age is: "+avg);
    
    
    }
    }
