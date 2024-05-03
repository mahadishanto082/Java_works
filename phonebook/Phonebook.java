package phonebook;

class Main{
    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        int n=10;
        PhoneBook member[] = new PhoneBook[n];
        String name;
        int phone;
        int area;
        for (int i=0;i<n;i++){
            System.out.print("Enter the name : ");
            name = jin.next();
            System.out.print("Enter Phone no : ");
            phone = jin.nextInt();
            System.out.print("Enter Area Code : ");
            area = jin.nextInt();
            member[i] =new PhoneBook(name,phone,area);
        }
        System.out.println("Enter a area_code ");
        area = jin.nextInt();
        for(int j=0;j<n;j++){
            if(member[j].area_code==area){
                member[j] = null;
            }
        }
        for (int i=0;i<n;i++){
            if(member[i]!=null){
                member[i].printInfo();
            }
        }

    }

}