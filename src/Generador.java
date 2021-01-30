import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class Generador extends AnasintBaseVisitor<Object> {

    public List<String> visitVars(Anasint.VarsContext ctx){
        List<String> res = new ArrayList<String>();
        for(Object o : ctx.VAR()){
            res.add(o.toString());
        }
        return res;
    }

    //tipo: elemental | no_elemental;
    public Integer visitTipo(Anasint.TipoContext ctx) {
        return (Integer) visit(ctx.getChild(0)); //recogemos "t"
    }

    // elemental: NUM | LOG ;
    public Integer visitElemental(Anasint.ElementalContext ctx) {
        Integer a = ctx.getStart().getType();
        return a;
    }

    //no_elemental: SEQ_NUM | SEQ_LOG;
    public Integer visitNo_elemental(Anasint.No_elementalContext ctx) {
        Integer a = ctx.getStart().getType();
        return a;
    }

}
