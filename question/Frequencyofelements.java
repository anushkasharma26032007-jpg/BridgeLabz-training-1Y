package classroomcode.question;

public class Frequencyofelements {
    public static void main(String[] args) {

                int[] arr = {1, 2, 2, 3, 1};

                for(int i = 0; i < arr.length; i++) {
                    int count = 0;

                    for(int j = 0; j < arr.length; j++) {
                        if(arr[i] == arr[j]) {
                            count++;
                        }
                    }

                    boolean alreadyPrinted = false;

                    for(int k = 0; k < i; k++) {
                        if(arr[i] == arr[k]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }

                    if(!alreadyPrinted) {
                        System.out.println(arr[i] + " = " + count);
                    }
                }
            }
        }


