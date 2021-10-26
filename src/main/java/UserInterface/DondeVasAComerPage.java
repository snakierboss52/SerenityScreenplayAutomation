package UserInterface;


import net.serenitybdd.screenplay.targets.Target;

import net.serenitybdd.core.annotations.findby.By;

public class DondeVasAComerPage {

    public static Target paraLlevar = Target.the("Para llevar").located(By.id("com.muy.selfmanagement:id/image_view_eat_at_home"));
    public static Target comerAqui = Target.the("Comer aquí").located(By.id("com.muy.selfmanagement:id/image_view_eat_here"));
}
