class FirstThread extends Thread{
    public void run() {
        for(int i=0; i<1000; i++)
            System.out.println("first thread running...");
    }
}

class SecondThread extends Thread {
    public void run() {
        for(int i=0; i<1000; i++)
            System.out.println("second thread runinng...");
    }
}

public class ThreadExample {
    public static void main(String[] args){
        FirstThread ft = new FirstThread();
        SecondThread st = new SecondThread();
        ft.start();
        st.start();
    }
}
