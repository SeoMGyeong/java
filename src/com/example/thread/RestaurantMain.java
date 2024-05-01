package com.example.thread;

class Chef extends Thread {
    private String name;
    private String dish;

    public Chef(String name, String dish) {
        this.name = name; // 생성자로 멤버변수 초기화
        this.dish = dish;
    }
    public void run() {
        System.out.println(name + "가 " + dish + "를 요리합니다.");
        try {
            Thread.sleep(2000); // 요리에 걸리는 시간(2초)
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        System.out.println(name + "이 " + dish + "를 완성했습니다.");
    }
}

public class RestaurantMain {
    public static void main(String[] args) {
        // 요리사를 생성하고 시작합니다.
        Chef chef1 = new Chef("요리사1", "스테이크");
        Chef chef2 = new Chef("요리사2", "파스타");
        Chef chef3 = new Chef("요리사3", "샐러드");
        chef1.start();
        chef2.start();
        chef3.start();

        //각 요리사의 스레드가 종료될때 까지 기다림.
//        try {
//            chef1.start();
//            chef2.start();
//            chef3.start();
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        } //이거 왜 안됨?

        // 모든 요리가 완료된 후에 배달을 한다.
        System.out.println("배달을 합니다.");
        
    }//main
}
