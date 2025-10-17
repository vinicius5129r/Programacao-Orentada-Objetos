package televisor.classes;

import java.util.List;

/**
 * Utilitário de botões/respostas que lista canais no terminal.
 * Notas:
 * - usar listarCanais(List<?>) é a forma mais direta e segura.
 * - listarCanais(Object tv) tenta chamar getCanais() por reflexão para evitar problemas de pacote/import.
 */
public class Botoes {

    /**
     * Lista os canais fornecidos no terminal.
     * Aceita qualquer List cujo toString() dos elementos represente o canal (Canal.toString()).
     */
    public void listarCanais(List<?> canais) {
        System.out.println();
        System.out.println("Canais disponíveis:");
        if (canais == null || canais.isEmpty()) {
            System.out.println("  nenhum canal cadastrado");
            return;
        }
        for (Object c : canais) {
            System.out.println("  " + c);
        }
    }

    /**
     * Tenta obter a lista de canais chamando tv.getCanais() por reflexão e delega para listarCanais(List<?>).
     * Isso evita precisar importar a classe TV/Canal diretamente (útil quando há diferenças de pacote).
     */
    public void listarCanais(Object tv) {
        if (tv == null) {
            System.out.println("Objeto tv é nulo");
            return;
        }
        try {
            java.lang.reflect.Method m = tv.getClass().getMethod("getCanais");
            Object result = m.invoke(tv);
            if (result instanceof List) {
                listarCanais((List<?>) result);
            } else {
                System.out.println("getCanais() não retornou uma List");
            }
        } catch (NoSuchMethodException nsme) {
            System.out.println("Objeto TV não possui método getCanais(): " + nsme.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao listar canais: " + e.toString());
            e.printStackTrace();
        }
    }
}
