/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.controladores;

public class Test
{
    final static int LLAMADAS = 710;

    public static void main(String[] args)
    {
        final Functor[] functors = new Functor[LLAMADAS];
        for (int i = 0; i < LLAMADAS; i++)
        {
            final int finalInt = i;
            functors[i] = new Functor()
            {
                @Override
                public void funa()
                {
                    System.out.print(finalInt + " ");
                    if (finalInt != LLAMADAS - 1)
                    {
                        functors[finalInt + 1].funa();
                    }
                }
            };
        }
        // Error
        functors[0].funa(); // 
    }

    interface Functor
    {
        void funa();
    }
}