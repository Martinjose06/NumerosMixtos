/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author LUCYLEONOR
 */
public class NumeroMixto {

    private int entero;
    private int numerador;
    private int denominador;

    public NumeroMixto(int entero, int numerador, int denominador) throws DenominadorCeroException {
        this.entero = entero;
        this.numerador = numerador;
        this.denominador = denominador;
        if (denominador == 0) {
            throw new DenominadorCeroException();
        }
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public NumeroMixto Suma(NumeroMixto m2) throws DenominadorCeroException {
        int NumI1, DenI1, NumI2, DenI2, num, den, NumM, DenM, EntM;
        NumeroMixto m;
        NumI1 = this.entero * this.denominador + this.numerador;
        DenI1 = this.denominador;
        NumI2 = m2.entero * m2.denominador + m2.numerador;
        DenI2 = m2.denominador;
        if (DenI1 == DenI2) {
            num = NumI1 + NumI2;
            den = DenI1 * 1;
            NumM = num % den;
            DenM = den;
            EntM = num / den;
        } else {
            num = NumI1 * DenI2 + DenI1 * NumI2;
            den = DenI1 * DenI2;
            NumM = num % den;
            DenM = den;
            EntM = num / den;
        }
        m = new NumeroMixto(EntM, NumM, DenM);
        return m;
    }

    public NumeroMixto Resta(NumeroMixto m2) throws DenominadorCeroException {
        int NumI1, DenI1, NumI2, DenI2, num, den, NumM, DenM, EntM;
        NumeroMixto m;
        NumI1 = this.entero * this.denominador + this.numerador;
        DenI1 = this.denominador;
        NumI2 = m2.entero * m2.denominador + m2.numerador;
        DenI2 = m2.denominador;
        if (DenI1 == DenI2) {
            num = NumI1 - NumI2;
            den = DenI1 * 1;
            NumM = num % den;
            DenM = den;
            EntM = num / den;
        } else {
            num = NumI1 * DenI2 - DenI1 * NumI2;
            den = DenI1 * DenI2;
            NumM = num % den;
            DenM = den;
            EntM = num / den;
        }
        m = new NumeroMixto(EntM, NumM, DenM);
        return m;

    }
    
    public NumeroMixto Multiplicacion(NumeroMixto m2) throws DenominadorCeroException{
        int NumI1, DenI1, NumI2, DenI2, num, den, NumM, DenM, EntM;
        NumeroMixto m;
        NumI1 = this.entero * this.denominador + this.numerador;
        DenI1 = this.denominador;
        NumI2 = m2.entero * m2.denominador + m2.numerador;
        DenI2 = m2.denominador;
        
        num = NumI1 * NumI2;
        den = DenI1 * DenI2;
        NumM = num % den;
        DenM = den;
        EntM = num / den;
        m = new NumeroMixto(EntM, NumM, DenM);
        return m;
    }
    
    
    
    public NumeroMixto Division(NumeroMixto m2) throws DenominadorCeroException{
        int NumI1, DenI1, NumI2, DenI2, num, den, NumM, DenM, EntM;
        NumeroMixto m;
        NumI1 = this.entero * this.denominador + this.numerador;
        DenI1 = this.denominador;
        NumI2 = m2.entero * m2.denominador + m2.numerador;
        DenI2 = m2.denominador;
        
        num = NumI1 * DenI2;
        den = DenI1 * NumI2;
        NumM = num % den;
        DenM = den;
        EntM = num / den;
        m = new NumeroMixto(EntM, NumM, DenM);
        return m;
        
        
    }

}
