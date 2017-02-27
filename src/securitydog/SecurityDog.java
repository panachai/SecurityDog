package securitydog;

public class SecurityDog extends Thread {

    public static void main(String[] args) {
        SecurityDog t1 = new SecurityDog();
        SecurityDog t2 = new SecurityDog();
        SecurityDog t3 = new SecurityDog();
        SecurityDog t4 = new SecurityDog();

        t1.setName("Owner");
        t2.setName("Dog");
        t3.setName("Police");
        t4.setName("Thife");

        /*
        t1.setPriority(10); 
        t2.setPriority(1);
         */
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

    public void run() {
        try {
            while (true) {
                if (Thread.currentThread().getName().equals("Owner")) {
                    Thread.sleep(16000); //ตื่น
                    Thread.sleep(8000);
                } else if (Thread.currentThread().getName().equals("Dog")) {
                        Thread.sleep(8000); //ตื่น
                        Thread.sleep(16000);
                } else if (Thread.currentThread().getName().equals("Police")) {
                    
                        Thread.sleep(24000); //ตื่น
                    
                } else if (Thread.currentThread().getName().equals("Thife")) {
                    for (int i = 200; i < 300; i++) {
                        Thread.sleep(16000);
                        Thread.sleep(8000); //ตื่น
                    }
                }
            }
        } catch (InterruptedException ieo) {
            System.out.println(ieo);
        }

    }

}
