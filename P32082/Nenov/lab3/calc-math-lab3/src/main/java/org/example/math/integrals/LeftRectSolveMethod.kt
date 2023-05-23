package org.example.math.integrals

import org.example.math.Function

class LeftRectSolveMethod(leftBound: Double, rightBound: Double, accuracy: Double)
    : IntegralSolveMethod(leftBound, rightBound, accuracy)
{
    override val k: Int = 1

    override fun calculate(func: Function, parts: Int): Double {
        val h: Double = (rightBound-leftBound) / parts
        var result: Double = 0.0
        for (i in 0 until parts) {
            result += func.calculate(leftBound+i*h)
        }
        return result*h
    }
}