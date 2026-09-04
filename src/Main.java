void main() {
    double bmi = calculateBmi(82.0, 1.79);
    double iansBmi = calculateBmi(76, 1.90);

    IO.println("Jakob, dit BMI er " + bmi + ". Du er " + classifyBmi(bmi));
    IO.println("Ian, dit BMI er " + iansBmi + ". Du er " + classifyBmi(iansBmi));
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