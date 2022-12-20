package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

  @RunWith(Cucumber.class)
  @CucumberOptions(
          features = "src/test/resourcess/features", //Features nerde bulacagimizi
          glue = "stepdefinitions",    // Java komutlarini nerede arayacagimiz
          tags = "@hotel", // Hangi seneryolari calistiracagimizi belirtiyor
          dryRun = false

  )

public class Runner {

    // Runner class inin body'sine hic bir kod yazmiyoruz
    // Bu class icin onemli olan kullanacagimiz 2 adet notasyon
    // dryRun = false yazildiginda belirlenen tag'la etiketlenen tum seneryolari sirasi ile calistirir
    // drRun = true dedigimizde ise  kodlari calistirmadan eksik stepler olup olmadigini kontrol eder ve varsa bize eksik stepleri rapor eder
}
