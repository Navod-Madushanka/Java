import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "A", urlPatterns = "/a")
public class A extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //        ServletInputStream is = request.getInputStream();
//        StringBuilder builder = new StringBuilder();
//        int c = 0;
//        while ((c = is.read()) != -1){
//            builder.append((char) c);
////            System.out.println((char) c+"");
//        }
//        System.out.println(builder.toString());
//        String name = request.getParameter("name");
//        System.out.println(name);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userData = request.getParameter("user");
//        JsonElement element = new JsonParser().parse(user);
//        JsonObject object = element.getAsJsonObject();
//        System.out.println(object.get("name").getAsString());

//        JsonObject jsonObject = new Gson().fromJson(user, JsonObject.class);
//        int age = jsonObject.get("age").getAsInt();
//        System.out.println(age);

        User user = new Gson().fromJson(userData, User.class);
        String name = user.getName();
        int age = user.getAge();

        System.out.println("Name: "+name+", age: "+age);

        ArrayList arrayList = new ArrayList();
        arrayList.add(user);
        arrayList.add(user);
        arrayList.add(user);
        arrayList.add(user);
        arrayList.add(user);

        response.setContentType("application/json");
        String s = new Gson().toJson(arrayList);

        try{
            Thread.sleep(10000);
        }catch (Exception e){

        }

        response.getWriter().println(s);
    }
}
