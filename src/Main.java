import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;

        exibirCabecalho();

        String[][] perguntasRespostas = {
                {"1) O que significa a métrica CPM?", "A) Custo por mil impressões", "B) Custo por mil aquisições", "C) Custo por mensagem", "D) Custo zero", "A"},
                {"2) O que é ROI no contexto de marketing digital?", "A) Return on Investment", "B) Rate of Interaction", "C) Reach of Impressions", "D) Record of Initiatives", "A"},
                {"3) O que é um lead magnet?", "A) Um ímã para atrair clientes", "B) Um programa de fidelidade", "C) Um tipo de anúncio pago", "D) Um tipo de métrica", "A"},
                {"4) O que são cookies em marketing digital?", "A) Pequenos arquivos de dados armazenados no navegador", "B) Promoções sazonais", "C) Ferramentas de design gráfico", "D) Estratégias de remarketing", "A"},
                {"5) Qual a importância do funil de vendas no marketing digital?", "A) Mapear o processo de compra do cliente", "B) Criar anúncios divertidos", "C) Enviar e-mails promocionais", "D) Criar blogs interessantes", "A"},
                {"6) O que é um influenciador digital?", "A) Pessoa com grande influência em redes sociais", "B) Software de edição de imagens", "C) Agência de marketing digital", "D) Ferramenta de automação", "A"},
                {"7) O que é o Google AdWords?", "A) Plataforma de publicidade online do Google", "B) Ferramenta de análise de concorrência", "C) Rede social do Google", "D) Serviço de e-mail do Google", "A"},
                {"8) O que significa SEO?", "A) Search Engine Optimization", "B) Social Engagement Optimization", "C) Search Engine Outreach", "D) Social Engine Optimization", "A"},
                {"9) O que é marketing de conteúdo?", "A) Estratégia focada na criação e distribuição de conteúdo relevante", "B) Promoção de produtos com desconto", "C) Publicidade paga", "D) Pesquisa de mercado", "A"},
                {"10) O que é um call-to-action (CTA)?", "A) Estímulo para realizar uma ação específica", "B) Ligações telefônicas para clientes", "C) Ferramenta de análise de dados", "D) Avaliação de campanhas publicitárias", "A"},
                {"11) Qual a importância do engajamento nas redes sociais?", "A) Fortalecimento da marca e interação com o público", "B) Aumento dos custos operacionais", "C) Redução da visibilidade online", "D) Foco exclusivo em vendas", "A"},
                {"12) O que é remarketing?", "A) Estratégia de direcionar anúncios a usuários que já interagiram com seu site", "B) Reciclagem de produtos", "C) Desenvolvimento de novos mercados", "D) Forma de mensuração de ROI", "A"},
                {"13) O que é o termo \"engajamento\" nas redes sociais?", "A) Interatividade e interações dos usuários com o conteúdo", "B) Número total de seguidores", "C) Tempo gasto online", "D) Volume de postagens diárias", "A"},
                {"14) O que é marketing de influência?", "A) Estratégia que utiliza pessoas influentes para promover produtos", "B) Publicidade tradicional", "C) Envolvimento em causas sociais", "D) Foco exclusivo em vendas online", "A"},
                {"15) Qual a importância do teste A/B no marketing digital?", "A) Comparação de duas versões de uma página para otimizar resultados", "B) Análise de custos operacionais", "C) Aumento do orçamento publicitário", "D) Mensuração de retorno financeiro", "A"}
        };

        for (int i = 0; i < perguntasRespostas.length; i++) {
            System.out.println(perguntasRespostas[i][0]);
            System.out.println(perguntasRespostas[i][1]);
            System.out.println(perguntasRespostas[i][2]);
            System.out.println(perguntasRespostas[i][3]);
            System.out.println(perguntasRespostas[i][4]);

            System.out.print("Escolha a alternativa correta (A, B, C, ou D): ");
            String respostaUsuario = scanner.next().toUpperCase();

            if (respostaUsuario.equals(perguntasRespostas[i][5])) {
                System.out.println("Alternativa correta!\n");
                pontuacao++;
            } else {
                System.out.println("Alternativa incorreta. A resposta correta é: " + perguntasRespostas[i][5] + "\n");
            }
        }

        System.out.println("Questionário concluído! Sua pontuação final é: " + pontuacao + "/" + perguntasRespostas.length);

        scanner.close();
    }

    private static void exibirCabecalho() {
        System.out.println("Unifan - 2023");
        System.out.println("Professor: Breno Pimenta\n");
        System.out.println("Este programa é um Questionário de Marketing Digital que consiste em 15 perguntas.");
        System.out.println("Cada pergunta possui 4 alternativas, sendo apenas uma correta.\n");
    }
}
