class Main {
    public static void main(String[] args) {
        Methods m = new Methods();
        String numbers = m.Random("TipoA");
        System.out.println(numbers);
        System.out.println("---");
        System.out.println(m.methods_sort("Asc", numbers));
        
    }
}
class Methods{
    public String Random(String a){
        String r = "";
        int b = 0;
        for(int i = 0; i < 8; i++){
            b= (int)(Math.random()*9+0);
            r += b;
        }
        if (a.equalsIgnoreCase("TipoA")){
            return "54" + r;
        }else{
            return "08" + r;
        }
    }
    
    public int[] Array_numbers(String s){
        int array[] = new int [s.length()];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(s.charAt(i) + "");
        }
        return array;
    }
    
    public String Show(int a[]){
        String s = ""; 
        for(int i = 0; i < a.length; i++){
            s += a[i] + " "; 
        }
        return s;
    }
    
    public String Asc(String s){
        int a[] = this.Array_numbers(s);
        int aux;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - 1; j++){
                if(a[j] > a[j + 1]){
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
        return this.Show(a);
    }
    
    public String Desc(String s){
        int a[] = this.Array_numbers(s);
        int aux;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - 1; j++){
                if(a[j] < a[j + 1]){
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
        return this.Show(a);
    }
    
    String methods_sort(String o, String numbers){
        if (o.equalsIgnoreCase("Asc")){
            return this.Asc(numbers);
        }else{
            return this.Desc(numbers);
        }
    }
    
}