
public class RandomSeqMain2 {

		public static void main(String[] args) {
			String seqLen;
			
			RandomSeq seq = new RandomSeq();
			
			seqLen = seq.getRandomSeq(100);
			
			seq.setSeq(seqLen);
			seq.formatSeq(10);
			
			
			System.out.print(seq);
		}
}