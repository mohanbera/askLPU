package vertX;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import io.vertx.core.json.JsonObject;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

class hello
{
  public static void main(String[] args) throws IOException, TemplateException
  {
    /*
    Configuration conf=new Configuration();

    HashMap<String,Object> hashMap=new HashMap<>();
    //hashMap.put("length",3);
    ArrayList<String> strArr1=new ArrayList<>();
    strArr1.add("Mohan");
    strArr1.add("Sourav");
    strArr1.add("Bera");
    hashMap.put("answers",strArr1);

    Template template=conf.getTemplate("src/pages/page.ftl");

    Writer consoleWriter=new OutputStreamWriter(System.out);
    template.process(hashMap,consoleWriter);

    Writer fileWriter=new FileWriter(new File("src/pages/page.html"));

    template.process(hashMap,fileWriter);

     */
/*
    mongoClient.find("ans",jsonObject,res1 ->
    {
      if(res1.succeeded())
      {
        for(JsonObject jsonObject1:res1.result())
        {
          String ID=jsonObject1.getString("ID");
          JsonObject jsonObject2=new JsonObject().put("ID",ID).put("yrating",new JsonObject().put("0000",3));
          mongoClient.find("rating",jsonObject2,res2->
          {
            if(res2.succeeded())
            {
              System.out.println(res2.result());
            }
          });
        }
      }

      for(JsonObject jsonObject1:res1.result())
        {
          String ID=jsonObject1.getString("ID");
          JsonObject jsonObject2=new JsonObject().put("ID",ID).put("yrating.regNo","00000");
          mongoClient.findOne("rating",jsonObject2,null,res3->
          {
            if(res3.succeeded())
            {
              System.out.println(res3.result().getJsonArray("yrating").getJsonObject(0).getInteger("rating"));
            }
          });
        }
    });

 */

    System.out.println(LocalDate.now());

  }
}
