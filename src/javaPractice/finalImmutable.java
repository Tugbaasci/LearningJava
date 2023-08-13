package javaPractice;

public class finalImmutable {
    // Soru: Immutable bir sınıf nasıl oluşturulur? Bir sınıfın değişmez (immutable) olması için
// nasıl adımlar atılır?
    public final class immutable{
        public final String orn; //final kelimesi ile değişmezlik özelliği tanılmanıyor
        public immutable(String orn){
            this.orn=orn;
        }
        public String getOrn(){
            //get metodu ile atanan değere ulaşıyorum.
            return orn;
        }
    }
}
