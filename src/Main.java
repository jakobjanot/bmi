void main() {
    double bmiAlex = calculateBmi(82.0, 1.79);
    double bmiBodil = calculateBmi(76, 1.90);

    IO.println("Alex, dit BMI er " + bmiAlex + ". Du er " + classifyBmi(bmiAlex));
    IO.println("Bodil, dit BMI er " + bmiBodil + ". Du er " + classifyBmi(bmiBodil));
}

double calculateBmi(double weight, double height) {
    return weight / (height * height);
}

String classifyBmi(double bmi) {
    if (isUnderWeight(bmi)) {
        return "undervægtig";
    } else if (isOverWeight(bmi)) {
        return "overvægtig";
    } else {
        return "normalvægtig";
    }
}

boolean isOverWeight(double bmi) {
    return bmi >= 25;
}

boolean isUnderWeight(double bmi) {
    return bmi <= 18.5;
}