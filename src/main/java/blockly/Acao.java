package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Acao {

public static final int TIMEOUT = 300;

/**
 *
 * Permissionavel
 *
 * @param securableName
 * @param applicationId
 *
 * @author Igor Andrade
 * @since 10/11/2022 09:36:18
 *
 */
public static Var ViewsPermissionavelVendas(@ParamMetaData(description = "securableName", id = "cd332a86") Var securableName, @ParamMetaData(description = "applicationId", id = "b67b322e") Var applicationId) throws Exception {
 return new Callable<Var>() {

   private Var views = Var.VAR_NULL;

   public Var call() throws Exception {
    System.out.println(
    Var.valueOf(
    Var.valueOf("param:").getObjectAsString() +
    securableName.getObjectAsString() +
    Var.valueOf("  -  ").getObjectAsString() +
    applicationId.getObjectAsString()).getObjectAsString());
    if (
    Var.valueOf(
    cronapi.logic.Operations.isNullOrEmpty(applicationId).getObjectAsBoolean() &&
    Var.valueOf(securableName.equals(
    Var.valueOf("Vendas"))).getObjectAsBoolean()).getObjectAsBoolean()) {
        views =
        cronapi.list.Operations.newList(
        cronapi.object.Operations.newObject(Var.valueOf("app.entity.View"),Var.valueOf("securable",
        Var.valueOf("Vendas")),Var.valueOf("pattern",
        Var.valueOf("/mobileapp/views/vendas/**")),Var.valueOf("getMethodAllowed",
        Var.VAR_TRUE),Var.valueOf("headMethodAllowed",
        Var.VAR_TRUE),Var.valueOf("putMethodAllowed",
        Var.VAR_TRUE),Var.valueOf("postMethodAllowed",
        Var.VAR_TRUE),Var.valueOf("patchMethodAllowed",
        Var.VAR_TRUE),Var.valueOf("deleteMethodAllowed",
        Var.VAR_TRUE),Var.valueOf("optionsMethodAllowed",
        Var.VAR_TRUE),Var.valueOf("traceMethodAllowed",
        Var.VAR_TRUE),Var.valueOf("application",applicationId)));
    }
    System.out.println(
    Var.valueOf(
    Var.valueOf("views:").getObjectAsString() +
    views.getObjectAsString()).getObjectAsString());
    return views;
   }
 }.call();
}

}

