import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> gamesNostalgico = new ArrayList<>();
        gamesNostalgico.add("Zelda Majora's");
        gamesNostalgico.add("Mario kart 64");
        gamesNostalgico.add("Killer Instinct");
        System.out.println("--- LISTA INICIAL COM ALTERAÇÃO ---");
        procurarEAtualizarjogo(gamesNostalgico, "Quake 2", "WCW NWO");
        exibirLista(gamesNostalgico);

        System.out.println("\n--- REVISÃO APÓS REMOÇÃO ---");
        removerGame(gamesNostalgico, "Mario party 64");
        exibirLista(gamesNostalgico);
    }

    public static void procurarEAtualizarjogo(ArrayList<String> lista, String jogoAntigo, String novojogo){
        boolean encontrou = false;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).equals(jogoAntigo)){
                lista.set(i, novojogo);
                encontrou = true;
            }
        }
        if(!encontrou){
            System.out.println("Erro: O jogo " + jogoAntigo + " Não foi encontrado");
        }
    }

    public static void exibirLista(ArrayList<String> lista){
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Exibindo titulos: " +  lista.get(i));
        }
    }


    public static void removerGame(ArrayList<String> lista, String removerJogo){
        boolean encontrou = false;
        for(int i = 0; i < lista.size(); i++){
            if (lista.get(i).equals(removerJogo)){
                System.out.println("jogo encontrado e removido!!");
                lista.remove(i);
                encontrou = true;
                break; //isso faz diferença ná memória do pc
            }
        }
        if(!encontrou){
            System.out.println("ERRO: O jogo " + removerJogo + " não exite na lista!");
        }
    }
}