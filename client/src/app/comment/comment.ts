import { ITopic } from '../topic/topic';

export interface IComment {
  id: number;
  text: string;
  topic: ITopic
}
