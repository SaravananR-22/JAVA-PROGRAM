class function{
    int apple_price=20;
    int apple_count=5;
    
    void cost(){
        System.out.print(apple_count*apple_price);
    }

    public static void main(String[] args){
        function obj = new function();
        obj.cost();

    }
}