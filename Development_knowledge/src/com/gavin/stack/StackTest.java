package com.gavin.stack;

public class StackTest {
	
	Object[] stacks; //ջ����
	int size;//ջ�Ĵ�С
	int top;//��¼λ��
	int len;
	
	StackTest(int size){
		this.size=size;
		this.stacks=new Object[this.size];
		this.top = -1;
	}
	
	/*
	 * 1����ջ pop
	 * 2����ջ push
	 * 3: ��ȡջ����Ԫ�� peek()
	 * 4: ջ���ж� isEmpty
	 * 5: ջ�Ƿ����� isFull
	 * 
	 * */
	
	// ��ȡջ��Ԫ��
	public Object peek(){
		return this.stacks[top];
	}
	
	// �ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty(){
		return size()==0;
	}
	
	//ջ�Ƿ�����
	public boolean isFull(){
		return top==size-1;
	}
	
	// ��ջ�Ĺ���
	public void push(Object val){
		len++;
		stacks[++this.top]=val;
	}
	
	// ��ջ����
	public Object pop(){
		len--;
		return stacks[this.top--];
	}
	
	// ��ȡ����
	public int size(){
		return this.len;
	}
	
	// ���ջ
	public void clear(){
		this.size=0;
		this.top=-1;
		this.len=0;
		this.stacks=new Object[this.size];
	}
	
	
	public static void main(String[] args) {
		StackTest stackDemo=new StackTest(10);
//		System.out.println(stackDemo.isEmpty());
//		System.out.println(stackDemo.isEmpty());
		stackDemo.push(1);
		stackDemo.push(2);
		stackDemo.push(3);
		stackDemo.push(4);
		stackDemo.push(5);
		stackDemo.push(6);
		stackDemo.push(7);
		stackDemo.push(8);
		stackDemo.push(9);
		stackDemo.push(10);
		System.out.println(stackDemo.isFull());
		System.out.println("��ջ֮ǰ��"+stackDemo.size());
		System.out.println(stackDemo.pop());
		System.out.println("��ջ֮��"+stackDemo.size());
		System.out.println(stackDemo.peek());
	}
	
}
