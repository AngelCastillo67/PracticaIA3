/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import weka.classifiers.Classifier;
import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

/**
 *
 * @author mariano
 */
public class Modelo {

    private Instances leerInstancias(String ficherArff){
        try{
            Instances inst = new Instances(new BufferedReader(new FileReader(ficherArff)));

            inst.setClassIndex(inst.numAttributes() - 1);

            return inst;
        }catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void aprenderModelo()
    {
        try {
            // create J48
            Classifier cls = new J48();

            // train
            Instances inst = leerInstancias("./training_data/internationalMatches.arff");
            cls.buildClassifier(inst);

            // serialize model
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./models/internationalMatchesJ48.model"));
            oos.writeObject(cls);
            oos.flush();
            oos.close();
        } catch (Exception ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }



    public String aplicarModelo() {
        try{
            String[] valoresAtributos = {"H","A","D"};


            Classifier clasificador  = (Classifier) weka.core.SerializationHelper.read("./models/internationalMatchesJ48.model");
Instances data = leerInstancias("./test_data/test1.arff");

        data.setClassIndex(data.numAttributes() - 1);


        double prediction = clasificador.classifyInstance(data.instance(0));

            StringBuilder sb = new StringBuilder();   
for (int i = 0; i < 3; i++)
                sb.append(valoresAtributos[(int) clasificador.classifyInstance(data.instance(i))] + "  ");
            return sb.toString();


           //  return valoresAtributos[(int) prediction];





}
catch (Exception ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            return "Error al intentar leer el modelo";
        }
    }
}
