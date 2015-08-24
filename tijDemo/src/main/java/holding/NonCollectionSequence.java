package holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Iterator;

/**
 * Created by weizwang on 2015/8/21.
 */
class PetSequence{
    protected Pet[] pets= Pets.createArray(8);
}
public class NonCollectionSequence extends PetSequence{
    public Iterator<Pet> iterator(){
        return new Iterator<Pet>() {
                private int index=0;
            public boolean hasNext() {
                return index<pets.length;
            }

            public Pet next() {

                return pets[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

}
