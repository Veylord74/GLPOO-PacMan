
public class SimpleForme implements Forme{
		
		private String name;
		private int positionx;
		private int positiony;
		private int positionx1;
		private int positiony1;
		private FormeType formeType;
		
		public SimpleForme(String name, int positionx, int positiony, FormeType formeType, int positionx1, int positiony1) {
			super();
			this.name = name;
			this.positionx = positionx;
			this.positiony= positiony;
			this.formeType = formeType;
			this.positionx1 = positionx1;
			this.positiony1 = positiony1;
		}

		@Override
		public String getName() {
			return this.name;
		}

		@Override
		public FormeType getFormeType()
		{
			return formeType;
		}

		@Override
		public int getPositionx() {
			return positionx;
		}

		@Override
		public int getPositiony() {
			return positiony;
		}
		
		public int getPositionx1() {
			return positionx1;
		}

		public int getPositiony2() {
			return positiony1;
		}
}
