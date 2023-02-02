class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
    void display(){
        System.out.print(data+" ");
        if(next!=null){
            next.display();
        }
        System.out.println();
    }
    void insertionatend(int i){
        node temp=new node(i);
        temp.next=this.next;
    }
    void display(node temp){
        while(temp!=null){
            temp.display();
        }   
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        node head=new node(sc.nextInt(1));
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new node(sc.nextInt(1));
        temp.next.next=new node(sc.nextInt(2));
        temp.next.next.next=new node(sc.nextInt(3));
        temp.next.next.next.next=new node(sc.nextInt(4));
        temp.next.next.next.next.next=new node(sc.nextInt(5));
        insertionatend(6);
        display(temp);
}