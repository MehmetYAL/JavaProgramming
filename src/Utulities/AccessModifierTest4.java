package Utulities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifierTest4 extends ProtectedAccessModifier {
    public static void main(String[] args) {
        //System.out.println(ProtectedAccessModifier.name1);//default is not visible outside of the package
        System.out.println(ProtectedAccessModifier.name2);//protected is visible outside of the package only in subclass
    }

    }

