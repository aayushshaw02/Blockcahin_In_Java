package kryowizardry;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Output;

import java.io.FileOutputStream;
import java.io.IOException;

class Solution {
    public void doSerialization(Wizard wizard, String filename) throws IOException {
        Kryo kryo = new Kryo();
        kryo.register(kryowizardry.Wizard.class);
        try {
            // Create an output stream for serialization
            Output output = new Output(new FileOutputStream(filename));

            // Serialize the wizard object
            kryo.writeObject(output, wizard);

            // Flush and close the output stream
            output.flush();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
