package com;
	class ThreadClass extends Thread
	{
		int a;
		String msg;
		
		public ThreadClass(int a,String msg)
		{
			this.a=a;
			this.msg=msg;
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			for(int i=0;i<10;i++)
			{
				try
				{
					Thread.sleep(a);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				System.out.println(msg + a);
		}
		
		}
	}