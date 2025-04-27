package lista;

public class lista {
        int index = 1;
        node head = null;
        node tail = null;

        public void insert(String mes){
            node no = new node(mes);
            
            if(head == null){
                head = no;
            }
            else{
                no.prev = tail;
                tail.next = no;
            }
            tail = no;
        }

    
        public String mostrar(){
            String out = "";
            node no = head;

            if(head == null){
                return "";
            }
            else{
                while(no != null){
                out += no.mes + " | Posição: " + index + "\n";
                no = no.next;   
                index++; 
                }
                return out;
            }
        }

        public int verificar(int parametro){
           node temp = head;
           int index2 = index/2;

            while (temp != null) {
                    if(index == 0){
                        index = index/2;
                        return index;
                    }
                temp = temp.next;
                index2--;
            }
            return index/2;
            }
        

        public boolean binary(int alvo){
            int meio = 0;
            int esqueda = 0;
            int direita = index;

            while(esqueda <= direita){
                meio = (esqueda + direita)/2;

                if(verificar(meio) == alvo){
                    System.out.println(meio);
                    return true;
                }
                else if(verificar(meio) < alvo){
                    esqueda = meio + 1;
                }
                else{
                    direita = meio - 1;
                }
            }
            return false;
        }

}
