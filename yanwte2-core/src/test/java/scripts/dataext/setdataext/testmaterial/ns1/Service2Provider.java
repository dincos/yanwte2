package scripts.dataext.setdataext.testmaterial.ns1;

import scripts.dataext.setdataext.testmaterial.Context;
import scripts.dataext.setdataext.testmaterial.Service2;

/**
 * @author Winter Young
 * @since 2017/12/13
 */
public class Service2Provider implements Service2 {
    @Override
    public Integer apply(Context context) {
        DataExt dataExt = context.getDataExt();
        return dataExt.getI();
    }
}
