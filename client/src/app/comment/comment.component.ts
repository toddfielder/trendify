import { Component, OnInit, Input } from '@angular/core';
import { CommentService } from './comment.service';
import { Router, ActivatedRoute } from '@angular/router';
import { IComment } from './comment';

@Component({
  selector: 'app-comment',
  templateUrl: './comment.component.html',
  styleUrls: ['./comment.component.css']
})
export class CommentComponent implements OnInit {
  @Input()
  title: string;
  
  @Input()
  comments: IComment[];
  errorMessage: string;

  constructor(private _route: ActivatedRoute,
              private _router: Router,
              private _commentService: CommentService) { }

  ngOnInit() {
    console.log('CommentComponent::ngOnInit()');

//https://scotch.io/tutorials/3-ways-to-pass-async-data-to-angular-2-child-components#which-one-should-i-use
//prob need to init comments array with rx/js since it may be updated in real-time...
//currently is initialized in *ngIf
    //  if(this.comments != null){      
    //   console.log('CommentComponent::ngOnInit() comments: ' + this.comments.length);
    // }else{
    //   this._commentService.getComments()
    //     .subscribe(comments => this.comments = comments,
    //       error => this.errorMessage = <any>error);
    // }
  }

}
