public class ordenar {

    public void bubble(int vet[]){

        for(int i = 0; i < vet.length - 1; i++){
       
        for(int j = 0; j < vet.length - 1; j++){
            int temp = vet[j];

            if(vet[j] > vet[j + 1]){
            vet[j] = vet[j + 1];
            vet[j + 1] = temp;
            }
        }
    
    }
        
        for(int j = 0; j < vet.length - 1; j++){
            System.out.println(vet[j]);
                 }
    }

}
