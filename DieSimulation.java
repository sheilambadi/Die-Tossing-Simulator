package diesimulation;

import java.util.Random;

public class DieSimulation {

    public static void main(String[] args) {
        //Random number generator to bring element of chance
        Random rn = new Random();
        
        //counters to keep track of the frequency of getting the various numbers
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        
        //variables for the percantages of each outcome
        double percentage1, percentage2, percentage3, percentage4, percentage5, percentage6;

        //roll the dice 1000 times
        for(int i =0; i < 1000; i++) {
            //generate 36 random numbers
            int roll = rn.nextInt(36) + 1;
            
            //increment appropriate counter for a specific face of the die
            if(roll<6){
                counter1++;
            }else if(roll<12){
                counter2++;
            }else if(roll<18){
                counter3++;
            }else if(roll<24){
                counter4++;
            }else if(roll<30){
                counter5++;
            }else {
                counter6++;
            }     
        }
        
        //get percentage of the faces
        percentage1 = toPercent(counter1);
        percentage2 = toPercent(counter2);
        percentage3 = toPercent(counter3);
        percentage4 = toPercent(counter4);
        percentage5 = toPercent(counter5);
        percentage6 = toPercent(counter6);
        
        //get sum of the frequencies and percentages
        double totalPercent = percentage1+percentage2+percentage3+percentage4+percentage5+percentage6;
        double totalPercentage = Math.round(totalPercent*10)/10d;
        int totalFrequency = counter1+counter2+counter3+counter4+counter5+counter6;
        
        //display in tabular form
        System.out.println("           Frequency    Percentage");
        System.out.println("Face 1:    " + counter1 + "          " + percentage1);
        System.out.println("Face 2:    " + counter2 + "          " + percentage2);
        System.out.println("Face 3:    " + counter3 + "          " + percentage3);
        System.out.println("Face 4:    " + counter4 + "          " + percentage4);
        System.out.println("Face 5:    " + counter5 + "          " + percentage5);
        System.out.println("Face 6:    " + counter6 + "          " + percentage6);
        System.out.println("           " + totalFrequency + "         " + totalPercentage);       
    }
    
    //method to get percentage frequency of the various faces
    public static double toPercent(int frequency){
        double percent = (frequency/1000.0)*100;
        double roundedOff = Math.round(percent*10)/10d;
        return roundedOff;
    }
    
}
