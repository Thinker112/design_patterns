package cn.yyb.behavioral.chain_of_responsibility.chain_of_responsibility01;

/**
 * @author yyb
 * @create 2022-12-11 21:26
 */
public class Client {
    public static void main(String[] args) {
        OrcKing king = new OrcKing();
        // Orc commander handling request "defend castle"
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));

        // Orc officer handling request "torture prisoner"
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));

        // Orc soldier handling request "collect tax"
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }
}
