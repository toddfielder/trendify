//package com.fielder.config;
//
//import java.net.InetSocketAddress;
//import java.net.UnknownHostException;
//
//import org.elasticsearch.client.Client;
//import org.elasticsearch.client.transport.TransportClient;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.InetSocketTransportAddress;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
//
//@Configuration
//@EnableElasticsearchRepositories(basePackages = "com.fielder.repository")
//public class ESConfig {
//
////	@Value("${elasticsearch.host}")
////	private String EsHost;
////
////	@Value("${elasticsearch.port}")
////	private int EsPort;
////
////	@Value("${elasticsearch.clustername}")
////	private String EsClusterName;
//
////	@Bean
////	public Client client() throws Exception {
////
////		Settings esSettings = Settings.settingsBuilder().put("cluster.name", EsClusterName).build();
////
////		// https://www.elastic.co/guide/en/elasticsearch/guide/current/_transport_client_versus_node_client.html
////		return TransportClient.builder().settings(esSettings).build()
////				.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(EsHost), EsPort));
////	}
////
//	@Bean
//	public ElasticsearchOperations elasticsearchTemplate() throws Exception {
//		System.out.println("-----------------elasticsearchTemplate-----------------");
//		return new ElasticsearchTemplate(client());
//	}
//	
//	
//	@Bean
//    public Client client() throws Exception {
//        Settings settings = Settings.settingsBuilder()
//            .put("cluster.name", "docker-cluster")
//            .put("node.name", "demo-node")
//            .build();
//
//        Client client = TransportClient.builder()
//            .settings(settings)
//            .build()
//            .addTransportAddress(new InetSocketTransportAddress(new InetSocketAddress("192.168.99.100", 9200)));
//       
//       
//        return client;
//    }
//	
//	/*
//	"cluster_name": "docker-cluster",
//	"nodes": {
//	"Cf-76MdCSvey_tDxWGvbiw": {
//	"name": "Cf-76Md",
//	"transport_address": "172.18.0.2:9300",
//	"host": "172.18.0.2",
//	"ip": "172.18.0.2",
//	"version": "6.2.2",
//	"build_hash": "10b1edd",
//	"total_indexing_buffer": 50331648,
//	"roles": [
//	"master",
//	"data",
//	"ingest"
//	],
//	"settings": {
//	"cluster": {
//	"name": "docker-cluster"
//	},
//	"node": {
//	"name": "Cf-76Md"
//	},
//	"path": {
//	"logs": "/usr/share/elasticsearch/logs",
//	"home": "/usr/share/elasticsearch"
//	}*/
//
//}
