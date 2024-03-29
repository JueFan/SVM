package main;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		String[] arg = { "file\\svm.train2.txt", // 存放SVM训练模型用的数据的路径
				"file\\model_r.txt" }; // 存放SVM通过训练数据训/

		// 练出来的模型的路径
		String[] parg = { "file\\svm.test3.txt", // 这个是存放测试数据
				"file\\model_r.txt", // 调用的是训练以后的模型
				"file\\out_r.txt" }; // 生成的结果的文件的路径

		System.out.println("........SVM运行开始..........");
		// 创建一个训练对象
		svm_train t = new svm_train();
		// 创建一个预测或者分类的对象
		svm_predict p = new svm_predict();
		svm_train.main(arg); // 调用
		svm_predict.main(parg); // 调用
	}
}