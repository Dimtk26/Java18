package InvertableMatrix;


import IMatrix.IInvertableMatrix;
import Matrix.Matrix;

public class InvertableMatrix extends Matrix implements IInvertableMatrix {

    public InvertableMatrix(int size) {
        super(size);
        for(int i = 0; i < size; i++ ) {
            super.setElem(1.0, i, i);
        }
    }

    public InvertableMatrix(Matrix matrix) {
        super(matrix);
        if ()   // проверка на determ==0, огда необратимая
    }

    @Override
    public IInvertableMatrix invertMatrix() {
        return null;
    }
}
