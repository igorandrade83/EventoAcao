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
 * @since 10/11/2022 16:51:19
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
    views =
    cronapi.database.Operations.executeNativeQuery(Var.valueOf("app.entity.View"),Var.valueOf("select \n	id, \n	securable_id, \n	pattern,\n	getMethodAllowed,\n	headMethodAllowed,\n	putMethodAllowed,\n	postMethodAllowed,\n	patchMethodAllowed,\n	deleteMethodAllowed,\n	optionsMethodAllowed,\n	traceMethodAllowed,\n	application_id\nfrom \n	View"));
    cronapi.list.Operations.addLast(views,
    cronapi.object.Operations.newObject(Var.valueOf("app.entity.View"),Var.valueOf("id",
    Var.valueOf("93ab2d73-3143-4803-9091-4360bf8c7301")),Var.valueOf("securable",
    cronapi.object.Operations.newObject(Var.valueOf("app.entity.Securable"),Var.valueOf("id",
    Var.valueOf("f8eb8d0f-0ac2-4739-ae21-b4b140484af0")),Var.valueOf("name",
    Var.valueOf("Vendas")),Var.valueOf("application",
    cronapi.object.Operations.newObject(Var.valueOf("app.entity.Application"),Var.valueOf("id",
    Var.valueOf("1bfa1f35-9205-4a3b-b8e9-fad6d29df03f")),Var.valueOf("name",
    Var.valueOf("io.cronapp.apps.eventoacao")))))),Var.valueOf("pattern",
    Var.valueOf("/views/vendas/**")),Var.valueOf("getMethodAllowed",
    Var.VAR_TRUE),Var.valueOf("headMethodAllowed",
    Var.VAR_TRUE),Var.valueOf("putMethodAllowed",
    Var.VAR_TRUE),Var.valueOf("postMethodAllowed",
    Var.VAR_TRUE),Var.valueOf("patchMethodAllowed",
    Var.VAR_TRUE),Var.valueOf("deleteMethodAllowed",
    Var.VAR_TRUE),Var.valueOf("optionsMethodAllowed",
    Var.VAR_TRUE),Var.valueOf("traceMethodAllowed",
    Var.VAR_TRUE),Var.valueOf("application",
    cronapi.object.Operations.newObject(Var.valueOf("app.entity.Application"),Var.valueOf("id",
    Var.valueOf("1bfa1f35-9205-4a3b-b8e9-fad6d29df03f")),Var.valueOf("name",
    Var.valueOf("io.cronapp.apps.eventoacao"))))));
    System.out.println(
    Var.valueOf(
    Var.valueOf("views1i:").getObjectAsString() +
    views.getObjectAsString()).getObjectAsString());
    return views;
   }
 }.call();
}

/**
 *
 * Permissionavel
 *
 * @param securableName
 * @param applicationId
 *
 * @author Igor Andrade
 * @since 10/11/2022 16:51:19
 *
 */
public static Var ViewsPermissionavelVendas2(@ParamMetaData(description = "securableName", id = "cd332a86") Var securableName, @ParamMetaData(description = "applicationId", id = "b67b322e") Var applicationId) throws Exception {
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
    cronapi.logic.Operations.isNullOrEmpty(applicationId)
    .negate().getObjectAsBoolean()) {
        views =
        cronapi.database.Operations.executeNativeQuery(Var.valueOf("app.entity.View"),Var.valueOf("select \n	id, \n	securable_id, \n	pattern,\n	getMethodAllowed,\n	headMethodAllowed,\n	putMethodAllowed,\n	postMethodAllowed,\n	patchMethodAllowed,\n	deleteMethodAllowed,\n	optionsMethodAllowed,\n	traceMethodAllowed,\n	application_id\nfrom \n	View"));
        System.out.println(
        Var.valueOf(
        Var.valueOf("views1h:").getObjectAsString() +
        views.getObjectAsString()).getObjectAsString());
        if (
        Var.valueOf(securableName.equals(
        Var.valueOf("Vendas"))).getObjectAsBoolean()) {
            cronapi.list.Operations.addLast(views,
            cronapi.object.Operations.newObject(Var.valueOf("app.entity.View"),Var.valueOf("securable",
            cronapi.object.Operations.newObject(Var.valueOf("app.entity.Securable"),Var.valueOf("id",
            Var.valueOf("f8eb8d0f-0ac2-4739-ae21-b4b140484af0")),Var.valueOf("name",securableName),Var.valueOf("application",
            cronapi.object.Operations.newObject(Var.valueOf("app.entity.Application"),Var.valueOf("id",applicationId),Var.valueOf("name",
            Var.valueOf("io.cronapp.apps.eventoacao")))))),Var.valueOf("pattern",
            Var.valueOf("/views/vendas/**")),Var.valueOf("getMethodAllowed",
            Var.VAR_TRUE),Var.valueOf("headMethodAllowed",
            Var.VAR_TRUE),Var.valueOf("putMethodAllowed",
            Var.VAR_TRUE),Var.valueOf("postMethodAllowed",
            Var.VAR_TRUE),Var.valueOf("patchMethodAllowed",
            Var.VAR_TRUE),Var.valueOf("deleteMethodAllowed",
            Var.VAR_TRUE),Var.valueOf("optionsMethodAllowed",
            Var.VAR_TRUE),Var.valueOf("traceMethodAllowed",
            Var.VAR_TRUE),Var.valueOf("application",
            cronapi.object.Operations.newObject(Var.valueOf("app.entity.Application"),Var.valueOf("id",applicationId),Var.valueOf("name",
            Var.valueOf("io.cronapp.apps.eventoacao"))))));
            System.out.println(
            Var.valueOf(
            Var.valueOf("views2:").getObjectAsString() +
            views.getObjectAsString()).getObjectAsString());
        }
    }
    return views;
   }
 }.call();
}

}

