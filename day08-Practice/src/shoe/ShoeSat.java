package shoe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShoeSat {
		// 멤버변수 선언
		private Set<Shoe> shoes;

		// 생성자
		/**
		 * 기본생성자 : shoes 를 직접 HashSet<Shoe> 로 초기화 
		 */
		public ShoeSat() {
			shoes = new HashSet<Shoe>();
		}

		/**
		 * List<Shoe> shoes 를 매개변수로 하는 생성자
		 * @param shoes
		 */
		public ShoeSat(Set<Shoe> shoes) {
			this.shoes = shoes;
		}
		
		// 메소드
		// 메소드
		/**
		 * add(Shoe shoe) : int : 추가 성공 : 1, 추가 실패 : 0
		 * @param shoe
		 */
		public int add(Shoe shoe) {
			shoes.add(shoe);
			boolean success = shoes.add(shoe);
			int successCnt = 0;
			
			if (success) {
				successCnt++;
			} 
			
			return successCnt;
		}
		
		/**
		 * set(Shoe shoe) : int : 수정 성공 : 1, 수정 실패 : 0
		 * @param shoe
		 * @return
		 */
		public int set(Shoe shoe) {
			boolean success = shoes.contains(shoe);
			int successCnt = 0;
			
			if (success) {
				shoes.remove(shoe);
				shoes.add(shoe);
				successCnt++;
			}
			
			return successCnt;
		}
		
		/**
		 * remove(Shoe shoe) : int : 삭제 성공 : 1, 삭제 실패 : 0
		 * @param shoe
		 * @return
		 */
		public int remove(Shoe shoe) {
			boolean success = shoes.remove(shoe);
			int successCnt = 0;
			if (success) {
				shoes.remove(shoe);
				successCnt++;
			}
			
			return successCnt; 
		}
		
		/**
		 * get(Shoe shoe) : Shoe : 조회 성공 : shoe, 조회 실패 : null
		 * @param shoe
		 * @return
		 */
		public Shoe get(Shoe shoe) {
			Shoe found = null;
			
			for (Shoe sho : shoes) {
				if (sho.equals(shoe)) {
					found = sho;
					System.out.println(found);
					break;
				}
			}
			
			return found; 
		}
		
		/**
		 * getAllShoes()  : List<Shoe> : 전체목록을 리턴
		 * @return
		 */
		public List<Shoe> getAllShoes() {
			List<Shoe> shoes = new ArrayList<Shoe>();
			
			for (Shoe sho : this.shoes) {
				shoes.add(sho);
				System.out.println(sho);
			}
			
			return shoes;
		}
		
}
