package LVL3_Exercici2_Reloj;

public class Rellotge_Digital {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		for (int hour=0;hour< 60; hour++){
			
			Thread.sleep(1000);
			
			for (int minute =0; minute< 60; minute++){
				
				Thread.sleep(1000);
				
				for (int second = 0; second < 60; second++){
					
					Thread.sleep(1000);
					
					if (hour<10 && minute<10 && second >= 10 ){
						
						System.out.println("0" + hour + ":0" + minute + ":" + second);
						
					}
					else if (hour<10 && minute>=10 && second>=10){
						
						System.out.println("0" + hour + ":" + minute + ":" +second);
						
					}
					else if (hour<10 && minute>=10 && second<10){
						
						System.out.println("0" + hour + ":" + minute + ":0" +second);
						
					}
					else if (hour<10 && minute<10 && second<10){ 
						
						System.out.println("0" + hour + ":0" + minute + ":0" +second);
						
					} 
					
					else if (hour>=10 && minute>=10 && second>=10){
						
						System.out.println(hour + ":" + minute + ":" +second);
						
					}
					else if (hour>=10 && minute>=10 && second< 10){
						
						System.out.println(hour + ":" + minute + ":0" +second);
						
					}
					else if (hour>=10 && minute<10 && second<10){
						
						System.out.println(hour + ":0" + minute + ":0" +second);
						
					}
					else if (hour>=10 && minute<10 && second>=10){
						
						System.out.println(hour + ":0" + minute + ":" +second);
						
					}
						
					
				}
				
			}
			
		
		}

	}

}
